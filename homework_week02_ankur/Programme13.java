package homework_week02_ankur;
import java.util.Scanner;

public class Programme13 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();

    System.out.print("Enter the third number: ");
    int num3 = scanner.nextInt();

    int sum = num1 + num2 + num3;
    double average = sum / 3.0;

    System.out.println("The average of the numbers is " + average);
}
}
