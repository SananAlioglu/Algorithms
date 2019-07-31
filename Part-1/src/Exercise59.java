import java.util.Scanner;

/**
 * @author Sanan
 */
// Write a Java program to convert a given string into lowercase
public class Exercise59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string:");
        String string = input.nextLine();
        String str =string.toLowerCase();
        System.out.println(str);
    }
}
