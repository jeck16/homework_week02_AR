package homework_week02_ankur;
import java.util.Scanner;

public class Programme19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase
        String lowercaseString = inputString.toLowerCase();

        // Print the lowercase string
        System.out.println("The lowercase string is: " + lowercaseString);
    }
}
