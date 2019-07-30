import java.util.Scanner;

/**
 * @author Sanan
 */
// Write a Java program that takes three numbers as input to calculate and print the average of the numbers
public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number:");
        double num1 = sc.nextDouble();
        System.out.print("Input second number:");
        double num2 = sc.nextDouble();
        System.out.print("Input third number:");
        double num3 = sc.nextDouble();
        System.out.println("averageNumber = " + (num1+num2+num3)/3);

    }
}
