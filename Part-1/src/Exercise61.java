import java.util.Scanner;

/**
 * @author Sanan
 */
//Write a Java program to reverse a word.
public class Exercise61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a word:");
        String word = scan.next();
        String reverse = "";
        for(int i = word.length()-1;i >=0;i--) {
            reverse = reverse + word.charAt(i);
        }
        System.out.println("Reverse word:" + reverse);
    }
}

