package homework_week02_ankur;
import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String firstBinaryNumber = scanner.next();

        System.out.print("Input second binary number: ");
        String secondBinaryNumber = scanner.next();

        // Convert the binary numbers to integers
        int firstBinaryNumberInt = Integer.parseInt(firstBinaryNumber, 2);
        int secondBinaryNumberInt = Integer.parseInt(secondBinaryNumber, 2);

        // Add the two integers
        int sum = firstBinaryNumberInt + secondBinaryNumberInt;

        // Convert the sum to a binary number
        String sumBinaryNumber = Integer.toBinaryString(sum);

        // Print the sum
        System.out.println("The sum of the two binary numbers is " + sumBinaryNumber);
    }
}
