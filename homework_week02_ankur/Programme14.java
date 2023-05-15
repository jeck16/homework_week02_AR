package homework_week02_ankur;
import java.util.Scanner;

public class Programme14 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the width: ");
    float width = scanner.nextFloat();

    System.out.print("Enter the height: ");
    float height = scanner.nextFloat();

    float area = width * height;
    float perimeter = 2 * (width + height);

    System.out.println("Area is " + area);
    System.out.println("Perimeter is " + perimeter);
}
}
