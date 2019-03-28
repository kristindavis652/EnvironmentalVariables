import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");

        String itemOneName;
        String itemTwoName;
        String itemThreeName;

        out.print("Item 1? ");
        itemOneName = keyboard.nextLine();

        out.print("Item 2? ");
        itemTwoName = keyboard.nextLine();

        out.print("Item 3? ");
        itemThreeName = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");

        int itemOneQty;
        int itemTwoQty;
        int itemThreeQty;

        out.print("How many " + itemOneName + "? ");
        itemOneQty = keyboard.nextInt();

        out.print("How many " + itemTwoName + "? ");
        itemTwoQty = keyboard.nextInt();

        out.print("How many " + itemThreeName + "? ");
        itemThreeQty = keyboard.nextInt();

        out.println("Now, please enter the price of each item.");

        float itemOneCost;
        float itemTwoCost;
        float itemThreeCost;
        float total;

        out.print("How much does one " + itemOneName + " cost? ");
        itemOneCost = keyboard.nextFloat();

        out.print("How much does one " + itemTwoName + " cost? ");
        itemTwoCost = keyboard.nextFloat();

        out.print("How much does one " + itemThreeName + " cost? ");
        itemThreeCost = keyboard.nextFloat();

        out.println("Calculating your grocery bill.");

        total = (itemOneQty * itemOneCost) + (itemTwoQty * itemTwoCost) + (itemThreeQty * itemThreeCost);

        out.println("Your total grocery bill is " + total + ".");



    }
}

