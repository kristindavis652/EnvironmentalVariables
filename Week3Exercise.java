import static java.lang.System.out;
import java.util.Scanner;

public class Week3Exercise
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);



      System.out.println("Enter a number. ");
        int numberOne = keyboard.nextInt();

        System.out.println("Enter a number. ");
        int numberTwo = keyboard.nextInt();

        if (numberOne > numberTwo) {
            System.out.println(numberOne + "," + numberTwo);
        }
        else if (numberOne < numberTwo) {
            System.out.println(numberTwo + "," + numberOne);
        }
        else System.out.println("Numbers are equal.");

        }

}

