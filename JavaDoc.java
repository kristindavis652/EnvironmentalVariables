public class JavaDoc {

    public static void numberChecker(int input)
        throws Exception
    {
        if(input == 6) {
            throw new Exception("I don't like 6.");
        }else {
            System.out.println("Number" + input + "is good.");
        }
    }

    public static void main(String args[])
    throws Exception {
        numberChecker(4);
        numberChecker(5);
        numberChecker(6);
        numberChecker(7);
        numberChecker(8);

    }
}
