import java.util.Scanner;

/**
 * @author Sanan
 */
 //Write a Java program to capitalize the first letter of each word in a sentence
public class Exercise58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a Sentence:");
        String sentence = scan.nextLine();
        String upperLine = "";
            Scanner lineScan = new Scanner(sentence);
            while (lineScan.hasNext()) {
                String word = lineScan.next();
                upperLine = Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
                System.out.println(upperLine.trim());
            }
        }
    }
