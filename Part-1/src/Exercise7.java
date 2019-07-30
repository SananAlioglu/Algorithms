import java.util.Scanner;

/**
 * @author Sanan
 */
// Write a Java program that takes a number as input and prints its multiplication table upto 10
public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number:");
        double num = sc.nextDouble();
        for(int i =1;i<=10;i++){
            System.out.println(i + " x " + num + " = " + (i*num) );
        }
    }
}
