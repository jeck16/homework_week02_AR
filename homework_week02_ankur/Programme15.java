package homework_week02_ankur;

public class Programme15 {
    public static void main(String[] args) {

        // declare two variables
        int a = 10;
        int b = 20;

        // print the original values of a and b
        System.out.println("The original values of a and b are:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // swap the values of a and b using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // print the swapped values of a and b
        System.out.println("The swapped values of a and b are:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
