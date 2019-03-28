import java.util.Random;
import java.util.Scanner;



public class GuessMyNumber {
    public static void main(String[] args) {
        int guessThis = (int) (Math.random() * 100) + 1;
        int guess = -1;
        Scanner keyboard = new Scanner(System.in);
        String playAgain = "";
        do {
            System.out.println("I'm thinking of a number between 1 and 100. What is it?");

            System.out.println("Guess: ");
            guess = keyboard.nextInt();
            if (guess < 1 || guess > 100) {
                System.out.println("Oops! That number isn't between 1 and 100. Try again. \n");
            } else if (guess > guessThis) {
                System.out.println("My number is lower.");
            } else if (guess < guessThis) {
                System.out.println("My number is higher.");


            }
        } while (guess != guessThis);
        System.out.println("You guessed my number!");
        System.out.println("Do you want to play again? ");
        keyboard.skip("\n");
        playAgain = keyboard.nextLine();
    }
    }



















