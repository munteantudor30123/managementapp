package isp.lab3.exercise2;

import isp.lab3.exercise3.Vehicle;

public class Rectangle {

    private int lenght;
    private int width;
    private  String color;
    public  Rectangle()
    {
        this.lenght=2;
        this.width=1;
        this.color="red";
    }
    public Rectangle(int length, int width) {
        this.lenght = length;
        this.width = width;
        this.color = "red";
    }
    public Rectangle(int length, int width, String color) {
        this.lenght = length;
        this.width = width;
        this.color = color;
    }
    public int getLength() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    // Method to calculate perimeter
    public int getPerimeter() {
        return 2 * (lenght + width);
    }

    public int getArea() {
        return lenght * width;
    }
    public static void main(String[] args) {

        {
            Rectangle rectangle1 = new Rectangle();
            System.out.println("Rectangle 1 - Length: " + rectangle1.getLength() +
                    ", Width: " + rectangle1.getWidth() +
                    ", Color: " + rectangle1.getColor() +
                    ", Perimeter: " + rectangle1.getPerimeter() +
                    ", Area: " + rectangle1.getArea());

        }

    }}

