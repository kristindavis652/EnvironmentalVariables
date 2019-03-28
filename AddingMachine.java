import java.util.Scanner;

public class AddingMachine {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Adding Machine!");
        System.out.println("Total: 0");
        float total = 0;
        float add = 0;
        boolean keepGoing = true;
        int counter = 0;


        while (keepGoing) {
            System.out.println("Add: ");
            add = keyboard.nextFloat();
            System.out.println("Total: ");
            total += add;
            System.out.println(total);


            if (add > 0) {
                counter++;
            }




            if (add == 0) {
                keepGoing = false;

            }
            System.out.println("You entered " + counter + " numbers for a total of " + total);
        }
    }
}















