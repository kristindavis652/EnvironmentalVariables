import java.util.Scanner;

public class ForLoops1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        int x = 0;
        do {
            System.out.println("");
            System.out.println("Welcome to Bar Chart. Enter a number: ");
            x = keyboard.nextInt();
            barChart(x);
        } while (x !=0);
        System.out.println("");
        System.out.println("Have a good day.");

        }
        public static void barChart(int width) {
            for (int counter = 0; counter < width; counter++)
                System.out.print("#");
        }

    }
