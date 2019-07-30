import java.util.Scanner;

/**
 * @author Sanan
 */
// Write a Java program and compute the sum of the digits of an integer.
public class Exercise33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input an integer:");
        int num = sc.nextInt();
        int num1 = num/10;
        int num2 = num%10;
        System.out.print("The sum of the digits is:" + (num1+num2));
    }
}
