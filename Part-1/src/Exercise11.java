import java.util.Scanner;

/**
 * @author Sanan
 */
 //Write a Java program to print the area and perimeter of a circle
public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input radius = ");
        double r = sc.nextDouble();
        System.out.println("Perimeter is:" + (2 * Math.PI * r));
        System.out.println("Area is:" + (Math.PI * Math.pow(r,2)));
    }
}
