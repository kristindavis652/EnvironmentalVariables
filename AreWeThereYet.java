import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        String thereYet = "";
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("Are we there yet?");
            thereYet = keyboard.nextLine();
            if (thereYet.equals("y")) {
                keepGoing = false;
                System.out.println("Yay!");
            } else if (!thereYet.equals("n") && !thereYet.equals("y")) {
                System.out.println("Huh? I didn't understand that.\n");

            }
        }
    }


}
