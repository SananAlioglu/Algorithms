import java.util.Scanner;

/**
 * @author Sanan
 */
// Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer
public class Exercise52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number:");
        double num1 = sc.nextDouble();
        System.out.print("Input the second number:");
        double num2 = sc.nextDouble();
        System.out.print("Input the third number:");
        double num3 = sc.nextDouble();
        double sum = num1 + num2;
        if(sum==num3){
            System.out.println("The result is: true ");
        }else{
            System.out.print("The result is: false ");
        }


    }
}
