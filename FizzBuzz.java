public class FizzBuzz {
    public static void main(String[] args) {
        int counter = 1;


        for (int i = 1; i >= 100; i++) {
            //while (counter <= 100);
            if (counter % 5 == 0 && counter % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (counter % 3 == 0) {
                System.out.println("fizz");
            } else if (counter % 5 == 0) {
                System.out.println("buzz");


            } else {
                System.out.println(counter);
            }
            counter++;
        }

    }
}








