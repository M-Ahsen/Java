//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

import java.util.Scanner;
class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area () {
        return width*height;
    }

    public int perimeter () {
        return 2*area();
    }
}
 class Q_3_INFT221101056 {
    public static void main(String[] args) {
    int width = 6;
    int height = 4;
    Rectangle obj = new Rectangle(width,height);
    System.out.println("Width of Rectangle:"+ width);
    System.out.println("Height of Rectangle:"+ height);
    System.out.println("Area of Rectangle: "+obj.area());
    System.out.println("Perimeter of Rectangle: "+obj.perimeter());
    }
 }