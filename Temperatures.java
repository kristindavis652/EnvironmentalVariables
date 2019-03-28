public class Temperatures {
    public static void main(String[] args) {
        int[][] temps = new int[4][7];
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        System.out.println("Temperature Calculator. \n");
        System.out.println("The data provided are: \n");
        String timeOfDay[] = {"7:00 AM: ", "3:00 PM: ", "7:00 PM: ", "3:00 AM: "};
        String days[] = {"Sunday: ", "Monday: ", "Tuesday: ", "Wednesday: ", "Thursday: ", "Friday: ", "Saturday: "};



        for (int rows = 0; rows < 4; rows++) {
            int sum = 0;
            System.out.print(timeOfDay[rows]);
            for (int columns = 0; columns < 7; columns++) {
                System.out.print(temps[rows][columns] + " ");
                System.out.print("");
                sum += temps[rows][columns];

            }

            System.out.println("");
            System.out.println("\nBased on that data, the following are the average temperatures for the week.\n");
            float average = sum / 7;

        }


        for (int columns = 0; columns < days.length; columns++) {
            int sum = 0;
            for (int rows = 0; rows < timeOfDay.length; rows++) {
                sum += temps[rows][columns];
            }
            float average = sum / temps.length;
            System.out.print(days[columns]);
            System.out.println(average);

        }
        System.out.println("");


        int sum2 = 0;
        for (int rows = 0; rows < 4; rows++) {
            int sum = 0;
            for (int columns = 0; columns < 7; columns++) {
                sum += temps[rows][columns];
                sum2 += temps[rows][columns];

            }
            float average = sum / 7;

            System.out.println(timeOfDay[rows] + average);

        }
        float average3 = sum2 / 28;
        System.out.print("\nThe final average temperature for the week was:\n");
        System.out.println("\nOverall: " + average3);
    }
}









































