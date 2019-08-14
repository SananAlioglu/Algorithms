import java.util.Random;

/**
 * @author Sanan
 */
//Find max/min

public class RandomMaxMin {
        public static void main (String[]args){
            Random r = new Random();
            int a = r.nextInt(2000);
            int b = r.nextInt(2000);
            System.out.println(a);
            System.out.println(b);

            if(a>b){
                System.out.println("max = " + a);
                System.out.println("min = " + b);
            }else {
                System.out.println("max = " + b);
                System.out.println("min = " + a);
            }
        }
    }

