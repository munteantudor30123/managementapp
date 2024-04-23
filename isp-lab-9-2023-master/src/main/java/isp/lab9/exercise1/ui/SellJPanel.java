package isp.lab9.exercise1.ui;

import isp.lab9.exercise1.services.UserPortfolio;
import isp.lab9.exercise1.utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SellJPanel extends JPanel {
    private StockMarketJFrame mainFrame;

    public SellJPanel(StockMarketJFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(2, 2));

        JPanel sellPanel = new JPanel();
        sellPanel.setLayout(new GridLayout(10, 2));

        JLabel ownedSharesLabel = new JLabel("Owned shares:");
        JTextArea ownedSharesTextArea = new JTextArea(getOwnedSharesText());
        ownedSharesTextArea.setEditable(false);

        JLabel symbolLabel = new JLabel("Symbol:");
        JComboBox<String> symbolComboBox = new JComboBox<>();
        symbolComboBox.setModel(new DefaultComboBoxModel(getOwnedSymbols()));

        JLabel quantityLabel = new JLabel("Quantity:");
        JTextField quantityTextField = new JTextField();

        JLabel earningsLabel = new JLabel("Earnings:");
        JTextField earningsTextField = new JTextField();
        earningsTextField.setEditable(false);

        JButton sellButton = new JButton("Sell");
        sellButton.addActionListener(e -> {
            UserPortfolio userPortfolio = mainFrame.getPortfolio();
            String symbol = (String) symbolComboBox.getSelectedItem();
            Integer quantity = Integer.parseInt(quantityTextField.getText());

            if (userPortfolio.getShares().containsKey(symbol) && userPortfolio.getShares().get(symbol) >= quantity) {
                BigDecimal earnings = calculateEarnings(symbol, quantity);
                userPortfolio.getShares().compute(symbol, (key, value) -> value - quantity);
                userPortfolio.setCash(userPortfolio.getCash().add(earnings));
                ownedSharesTextArea.setText(getOwnedSharesText());
                quantityTextField.setText("");
                earningsTextField.setText("");
            } else {
                JOptionPane.showMessageDialog(this,
                        "You don't have enough shares to sell!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton earningsButton = new JButton("Get earnings");
        earningsButton.addActionListener(e ->
                calculateEarningsActionPerformed(symbolComboBox, quantityTextField, earningsTextField));

        sellPanel.add(ownedSharesLabel);
        sellPanel.add(ownedSharesTextArea);
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(symbolLabel);
        sellPanel.add(symbolComboBox);
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(quantityLabel);
        sellPanel.add(quantityTextField);
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(earningsLabel);
        sellPanel.add(earningsTextField);
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(earningsButton);
        sellPanel.add(sellButton);
        add(sellPanel);
        add(new JPanel()); // empty cell in the grid
        add(new JPanel()); // empty cell in the grid
        add(new JPanel()); // empty cell in the grid
    }

    private String[] getOwnedSymbols() {
        return mainFrame.getPortfolio().getShares().keySet().toArray(new String[0]);
    }

    private String getOwnedSharesText() {
        StringBuilder stringBuilder = new StringBuilder();
        UserPortfolio userPortfolio = mainFrame.getPortfolio();
        for (String symbol : userPortfolio.getShares().keySet()) {
            stringBuilder.append(symbol).append(": ").append(userPortfolio.getShares().get(symbol)).append("\n");
        }
        return stringBuilder.toString();
    }

    private BigDecimal calculateEarnings(String symbol, int quantity) {
        BigDecimal stockPrice = mainFrame.getMarketService().getStockPrice(symbol);
        return stockPrice.multiply(new BigDecimal(quantity));
    }

    private void calculateEarningsActionPerformed(JComboBox<String> symbolComboBox,
                                                  JTextField quantityTextField,
                                                  JTextField earningsTextField) {
        try {
            String symbol = (String) symbolComboBox.getSelectedItem();
            int quantity = Integer.parseInt(quantityTextField.getText());

            BigDecimal earnings = calculateEarnings(symbol, quantity);
            earningsTextField.setText(Utils.formatBigDecimal(earnings));
        } catch (NumberFormatException e) {
            earningsTextField.setText("Invalid quantity value!");
        }
    }
}

