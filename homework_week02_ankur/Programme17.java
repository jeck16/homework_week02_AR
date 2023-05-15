package homework_week02_ankur;
import java.util.Scanner;

public class Programme17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        int decimalNumber = scanner.nextInt();

        // Convert the decimal number to a binary number
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Print the binary number
        System.out.println("Binary number is: " + binaryNumber);
    }
}
