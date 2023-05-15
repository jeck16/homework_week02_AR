package homework_week02_ankur;

import java.util.Scanner;

/**
 * 5.Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Programme5 {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addtion(sc);
        substraction("Enter first number : ", "Enter second number:", sc);
        Programme5 obj = new Programme5();
        obj.multiplication("Enter first number: ", "Enter second number", sc);
        obj.division("Enter first number: ", "Enter second number", sc);
    }

    //Two static method addtion and substraction
        public static void addtion(Scanner sc) {

        System.out.print("Enter first number :   ");
       int a = sc.nextInt();
        System.out.print("Enter second number:  ");
       int b =  sc.nextInt();
        int ans = a + b;
        System.out.println("Addtion of "+a+" and "+b+" is : " + ans);

    }

    public static void substraction(String a, String b,Scanner sc) {

        System.out.print(a);
        int num1 = sc.nextInt();
        System.out.print(b);
        int num2 =  sc.nextInt();
        int ans = num1 - num2;
        System.out.println("substraction of "+num1+" and "+num2+" is : " + ans);


    }
    //Two instance method multiplication and division
    public void multiplication(String a, String b,Scanner sc){
        System.out.print(a);
        int num1 = sc.nextInt();
        System.out.print(b);
        int num2 =  sc.nextInt();
        int ans = num1 * num2;
        System.out.println("substraction of "+num1+" and "+num2+" is : " + ans);

    }
    public void division(String a, String b,Scanner sc){
        System.out.print(a);
        int num1 = sc.nextInt();
        System.out.print(b);
        int num2 =  sc.nextInt();
        int ans = num1 / num2;
        System.out.println("substraction of "+num1+" and "+num2+" is : " + ans);

    }
}
