package homework_week02_ankur;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Programme8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programme8 obj = new Programme8();
        obj.area(sc);
    }

    // creating instance method
    public void area(Scanner sc){

        System.out.print("Enter the base of the triangle: ");
        double width = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        double area = (width * height) / 2;
        System.out.println("The area of the triangle is " + area);
    }

}
