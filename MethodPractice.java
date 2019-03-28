public class MethodPractice {

    public static void main(String[] args) {
        //call both methods
        //scanner keyboard
        sayHi("Doug", "Jenny", "Pearl");
        String dog = "Howard";
        sayHi(dog, "Norman", "Franklin");
        int min = findMin(2, 3);
        System.out.println(min);
        min = findMin(7, 5);
        System.out.println(min);
    }

    //write two methods
    public static void sayHi(String name1, String name2, String name3) {
        System.out.println("Hello, " + name1 + ", " + name2 + ", and " + name3);
    }

    public static int findMin(int value1, int value2) {
        //scanner keyboard

        if(value1 < value2) {
            return value1;
        } else {
            return value2;
        }


        //unreachable
    }
}