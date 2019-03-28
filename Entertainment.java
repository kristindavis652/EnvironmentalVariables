import static java.lang.System.out;

import java.io.File;
import java.util.Scanner;

public class Entertainment
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        out.println("What is the weather like today? Answer: sunny cloudy or rainy. > ");
        String weather = keyboard.nextLine();

        out.println("What kind of mood are you in for activities? Answer: exercise party or quiet. > ");
        String mood = keyboard.nextLine();

        if (weather.equals("sunny") && mood.equals("exercise")) {
            out.println("For exercise on a sunny day, try a brisk walk in a nature preserve.");

        }
        else if (weather.equals("sunny") && mood.equals("party")) {
            out.println("For a fun party on a sunny day, look for a street festival.");
        }
        else if (weather.equals("sunny") && mood.equals("quiet")) {

            out.println("A sunny day is a beautiful day to sit under a tree and read a book.");
        }
        else if (weather.equals("cloudy") && mood.equals("exercise")) {

            out.println("For exercise on a cloudy day, the botanical gardens are a lovely walk.");
        }
        else if (weather.equals("cloudy") && mood.equals("party"))
        {
            out.println("For a fun party on a cloudy day, ride the paddle boats at the park.");
        }
        else if (weather.equals("cloudy") && mood.equals("quiet"))
        {
            out.println("On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
        }
        else if (weather.equals("rainy") && mood.equals("exercise"))
        {
            out.println("Giant indoor trampolines are a fun place to exercise on a cloudy day.");
        }
        else if (weather.equals("rainy") && mood.equals("party"))
        {
            out.println("See if your friends are playing board games to pass a rainy day.");
        }
        else if (weather.equals("rainy") && mood.equals("quiet"))
        {
            out.println("A rainy day is a peaceful time to journal and daydream.");
        }
        if (!weather.equals("sunny") && !weather.equals("cloudy") && !weather.equals("rainy")) {
            out.println("Error. Your weather answer wasn't one of the valid options.");
            }
        if (!mood.equals("exercise") && !mood.equals("party") && !mood.equals("quiet")) {
                out.println("Error: Your mood answer wasn't one of the valid options.");
            }








    }
}



