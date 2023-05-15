package homework_week02_ankur;
import java.util.Scanner;
public class Programme18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

        // Addition
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        // Subtraction
        int difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);

        // Multiplication
        int product = firstNumber * secondNumber;
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);

        // Division
        int quotient = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);

        // Remainder
        int remainder = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + remainder);
    }
}
