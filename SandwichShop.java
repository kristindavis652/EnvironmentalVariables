import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int GoalForVeggies = 50;
        int GoalForBurgers = 250;
        int GoalForSubs = 180;
        int GoalForSoup = 70;


        out.println("Checking sales goals.");
        out.println("The sales goal for veggies is " + GoalForVeggies + ".");
        out.println("How many veggie sandwiches were sold today? ");
        int VeggiesSold = keyboard.nextInt();

        if (VeggiesSold >= GoalForVeggies)
        {
            out.println("Meets Goal!");
        }
        else
        {
            out.println("Fell Short.");
        }

        out.println("The sales goal for burgers is " + GoalForBurgers + ".");
        out.println("How many burgers were sold today? ");
        int BurgersSold = keyboard.nextInt();

        if (BurgersSold >= GoalForBurgers)
        {
            out.println("Meets Goal!");
        }
        else
        {
            out.println("Fell Short.");
        }

        out.println("The goal for subs is " + GoalForSubs + ".");
        out.println("How many subs were sold today? ");
        int SubsSold = keyboard.nextInt();

        if (SubsSold >= GoalForSubs)
        {
            out.println("Meets Goal!");
        }
        else
        {
            out.println("Fell Short.");
        }

        out.println("The sales goal for soup is " + GoalForSoup + ".");
        out.println("How man soups were sold today ?");
        int SoupSold = keyboard.nextInt();

        if(SoupSold >= GoalForSoup)
        {
            out.println("Goal Met!");
        }
        else
        {
            out.println("Fell Short.");
        }

        if(VeggiesSold >= GoalForVeggies && BurgersSold >= GoalForBurgers && SubsSold >= GoalForSubs && SoupSold >=GoalForSoup)
        {
            out.println("Made goal for everything!");
        }
        }
    }


