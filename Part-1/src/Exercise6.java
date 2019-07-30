import java.util.Scanner;

/**
 * @author Sanan
 */
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number:");
        double firstNumber = sc.nextDouble();
        System.out.print("Input second number:");
        double secondNumber = sc.nextDouble();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber % secondNumber));



    }
}
