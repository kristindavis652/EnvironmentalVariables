public class ExceptionPractice {

    private int threshold;

    public ExceptionPractice(int threshold) {
        this.threshold = threshold;

    }

    public int doTheThing(int value) {

        if (value < threshold) {
            throw new IllegalArgumentException();
        }
        return value * 2;

    }

    public int doTheOtherThing(int value) {
        return value * 2;


    }

    public static void main(String[] args) {
        ExceptionPractice ep = new ExceptionPractice(0);
        try {
            int result = ep.doTheThing(-8);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("I was expecting a positive value. You gave me a negative value.");
            e.printStackTrace();


        }
    }
}
