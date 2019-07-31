import java.util.Scanner;

/**
 * @author Sanan
 */
 //Write a Java program to compare two numbers.
public class Exercise32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number:");
        double num1 = sc.nextDouble();
        System.out.print("Input second number:");
        double num2 = sc.nextDouble();
        if(num1==num2){
            System.out.println(num1 + " = " + num2);
        }else{
            System.out.println(num1 + " != " + num2);
        }
        if(num1<num2){
            System.out.println(num1 + " < " + num2);
        }else{
            System.out.println(num1 + " > " + num2);
        }
        if(num1<=num2){
            System.out.println(num1 + " <= " + num2);
        }else{
            System.out.println(num1 + " >= " + num2);
        }
    }
}
