package isp.lab2.Exercise4StringSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        String[] splitInput = input.split(",");
        ArrayList<String> foundStringsList = new ArrayList<>();

        // Iterate through the array of strings and check if each string contains the substring
        for (String str : splitInput) {
            if (str.contains(substring)) {
                foundStringsList.add(str);
            }
        }
        String[] foundStringsArray = new String[foundStringsList.size()];
        foundStringsArray = foundStringsList.toArray(foundStringsArray);

        return foundStringsArray;

    }

    public static String readFromConsole(String suffix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + suffix);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car"; // = readFromConsole("words");
        String substring = "te"; // = readFromConsole("substring");
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
