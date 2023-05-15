package homework_week02_ankur;
import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme7 {

        public static  void main(String[] args) {
            // define scanner
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a temperature in degrees Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            double celsius = ((fahrenheit - 32) * 5 / 9);

            System.out.println("The temperature is " + celsius + " degrees Celsius.");
        }
    }

