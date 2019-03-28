public class AverageTemps {
    public static void main(String[] args) {

        int weekOne[] = {66, 68, 72, 83, 73, 66, 85};
        int sum = 0;
        for (int index = 0; index < weekOne.length; index++) {
            sum += weekOne[index];
        }

        float average = sum / (float) weekOne.length;
        System.out.println("The average daily high temperature for week 1 is " + average + ".");

        int weekTwo[] = {86, 87, 85, 78, 79, 78, 80};
        int sumTwo = 0;

        for (int i = 0; i < weekTwo.length; i++) {
            sumTwo += weekTwo[i];
        }
        float averageTwo = sumTwo / (float) weekTwo.length;
        System.out.println("The average daily high temperature for week 2 is " + averageTwo + ".");


        int max1 = weekOne[0];
        int max2 = weekTwo[0];

        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String day = dayOfWeek[0];




        for (int i = 0; i < weekOne.length; i++) {
            if (weekOne[i] > max1) {
                max1 = weekOne[i];
                day = dayOfWeek[i];
            }
        }
        System.out.println("In week 1, " + day + " was the warmest, at " + max1 + " degrees.");

        for (int i = 0; i < weekOne.length; i++) {
            if (weekTwo[i] > max2) {
                max2 = weekTwo[i];
                day = dayOfWeek[i];
            }
        }

        System.out.println("In week 2, " + day + " was the warmest, at " + max2 + " degrees.");
    }
}
















