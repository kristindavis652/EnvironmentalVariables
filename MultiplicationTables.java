import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Multiplication Tables");
        System.out.println("");
        System.out.println("How large would you like to see them? Enter a number between 0 and 20: ");
        int size = keyboard.nextInt();
        int counter = 0;
        int number = 0;


            for (counter = 0; counter <= size; counter++) {
                for (number = 0; number <= size; number++)
                    System.out.println(counter + " x " + number + " = " + number * counter);
            }

        }

    }













