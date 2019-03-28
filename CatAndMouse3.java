import static java.lang.System.out;
import java.util.Scanner;

public class CatAndMouse3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String two = "You sneak quietly to the chair and climb its rough wood. The only place you can reach\n" +
                "from here is the table, so you climb it too. Looking around from the table, you see two\n" +
                "paths. You can walk across the countertop to the open window, or you can climb down\n" +
                "the table leg to the floor.\n" +
                "Where do you go? Options: window floor ";
        String three = "You sneak quietly to the table. The legs are polished and slippery, and you fall with a\n" +
                "thump when you try to climb up. The cat woke up! He chases you around the kitchen\n" +
                "and back into the mouse hole! Exhausted and hungry, you give up for the day.";
        String four = "You sneak quietly over to the lamp and try to climb it. The lamp buzzes slightly under\n" +
                "your paws, and the light turns on with a click! The cat heard the lamp turn on and snaps\n" +
                "awake. He chases you around the kitchen and back into your hole!";
        String five = "You sneak over to the cat's food dish. There's one piece of food on the floor and more\n" +
                "in the dish. You're very hungry.\n" + "What do you eat? Options: floor dish ";
        String six = "You sneak quietly across the room to the long curtains hanging by the window. The\n" +
                "curtains are an easy climb. The cat is still asleep. You smell a barn just outside.\n" +
                "Where do you go? Options: down window ";
        String seven = "You climb out the window and down. The tall grass hides you well. You find some tasty\n" +
                "spilled grain. By the time you get to the barn, you are well fed, and ready to take a nap\n" +
                "in the hay. There is no cat in the barn. You're a happy mouse.";
        String eight = "You try to climb down the table leg but it's too slippery. Thump! You hit the floor with a\n" +
                "bang. The cat wakes up and chases you around the kitchen! You race back to your hole,\n" +
                "still hungry, and hide for the rest of the day.";
        String nine = "You eat a large, tasty piece of cat food that was dropped on the floor. You were very\n" +
                "quiet. The cat hasn't woken up yet.\n" +
                "Where do you go next? Options: dish curtain ";
        String ten = "The cat food rattles loudly as you climb into the cat food dish. The cat wakes up! And\n" +
                "he knows exactly where you are. He's on you in an instant! You are lunch. :( We'll be\n" +
                "sure to notify your next of kin.";
        String eleven = "As you climb back down the curtain, the cat stretches and looks around the room. He\n" +
                "notices the curtain hanging strangely and comes over to investigate. You have barely a\n" +
                "moment to race back into your hole and try again tomorrow. ";
        String twelve = "You smell a barn nearby with fresh grain. You climb through the window and hide in the\n" +
                "tall grass. There's spilled grain here that makes a tasty treat. By the time you reach the\n" +
                "barn, you are well fed, and find a quiet spot in the hay for a nap. There is no cat in the\n" +
                "barn. You're a happy mouse!";
        String thirteen = "The cat food rattles loudly as you climb into the cat food dish. The cat wakes up! And\n" +
                "he knows exactly where you are. He's on you in an instant! You are lunch. :( We'll be\n" +
                "sure to notify your next of kin. ";
        String fourteen = "You quietly sneak over to the curtain. The cat wakes up slow and groggy. You've\n" +
                "already made it to the curtain by the time he notices you. With a burst of well-fed\n" +
                "strength, you race up the curtain and leap out the open window! Behind you, you hear\n" +
                "the thump of the cat hitting the window frame and not making it through.\n" +
                "You follow a grain trail to the barn and find some warm hay to hide in for a nap. There\n" +
                "is no cat in the barn. You're a happy mouse! ";

        out.println(" You are a small, hungry field mouse. You find yourself standing in a mouse hole in the\n" +
                "kitchen of a farm house. In the room is a bowl of cat food that smells really tasty. A\n" +
                "young cat is sleeping on a rug in the middle of the room.\n");
        out.println("Looking around the room, you see a wooden table with chairs, a metal floor lamp, and\n" +
                "curtains over a window. You can smell a summer breeze blowing in.\n");
        out.println("Where do you go? Options: chair table lamp food curtain ");







        String whereDoYouGoChairTableLampFoodCurtain = keyboard.nextLine();

        if (whereDoYouGoChairTableLampFoodCurtain.equals("chair")) {
            out.println(two);

            String whereDoYouGoWindowFloor = keyboard.nextLine();
            if (whereDoYouGoWindowFloor.equals("window")) {
                out.println(seven);
                out.println("You Win!");
            } else if (whereDoYouGoWindowFloor.equals("floor")) {
                out.println(eight);
                out.println("Try Again!");
            } else {
                out.println("Invalid response.");
            }
        }
        else if (whereDoYouGoChairTableLampFoodCurtain.equals("table")) {
            out.println(three);
            out.println("Try Again!");
        }
        else if (whereDoYouGoChairTableLampFoodCurtain.equals("lamp")) {
            out.println(four);
            out.println("Try again.");
        }
        else if (whereDoYouGoChairTableLampFoodCurtain.equals("food")) {
            out.println(five);
            String whatToEatFloorDish = keyboard.nextLine();
            if (whatToEatFloorDish.equals("floor")) {
                out.println(nine);
                String whereDoYouGoDishCurtain = keyboard.nextLine();
                if (whereDoYouGoDishCurtain.equals("dish")) {
                    out.println(thirteen);
                    out.println("The world's tiniest trombone plays at your mouse funeral.");
                } else if (whereDoYouGoDishCurtain.equals("curtain")) {
                    out.println(fourteen);
                    out.println("You win!");
                } else
                    out.println("Invalid response.");
            } else if (whatToEatFloorDish.equals("dish")) {
                out.println(ten);
                out.println("The world's tiniest trombone plays at your mouse funeral.");
            } else {
                out.println("Invalid response.");
            }
        }
        else if (whereDoYouGoChairTableLampFoodCurtain.equals("curtain")) {
            out.println(six);
            String whereDoYouGoDownWindow = keyboard.nextLine();
            if (whereDoYouGoDownWindow.equals("down")) {
                out.println(eleven);
                out.println("Try again.");
            } else if (whereDoYouGoDownWindow.equals("window")) {
                out.println(twelve);
                out.println("You win!");
            } else {
                out.println("Invalid response.");
            }
        } else {
            out.println("Invalid response.");


            }






    }




}