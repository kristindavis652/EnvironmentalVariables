public class TempsTest {
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


        int i = 0;
        int rows = 0;
        int columns = 0;



        for (rows = 0; rows < 4; rows++) {
            System.out.print(timeOfDay[rows]);

            int sum = 0;

            for (columns = 0; columns < 7; columns++) {

                System.out.print(temps[rows][columns] + ", ");
                sum += temps[rows][columns];
            }
            System.out.println((double) sum / temps.length);


            System.out.print("");

        }



        System.out.println("");

    }





}