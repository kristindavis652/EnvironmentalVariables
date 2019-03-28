
import java.util.Scanner;
public class ForLoopsPractice {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How big of a number should I count to? ");
        int width = keyboard.nextInt();


        for (int counter = 1; counter <= width; counter++)
            System.out.print(counter + " ");


        System.out.println("");



        for (int counter = width; counter > 0; counter--) {
            System.out.print(counter + " ");
        }



        }
    }









