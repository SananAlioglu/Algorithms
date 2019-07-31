import java.util.Scanner;

/**
 * @author Sanan
 */
//Write a Java program to find the penultimate (next to last) word of a sentence.
public class Exercise60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string:");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String penultimate = arr[arr.length-2];
        System.out.println("Penultimate word: " + penultimate);
    }
}
