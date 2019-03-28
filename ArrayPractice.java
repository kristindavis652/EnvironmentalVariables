
public class ArrayPractice {
    public static int maxArray(int[] array) {
        if(array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        for(int i = 0; i < array.length; i++ ) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] a1 = {4, 6, 0, -3, 2, 11}; //better if you know what values you want in the array
        int[] a2 = new int [3]; //better if you are asking the user to type in the values
        a2[0] = 4;
        a2[1] = 9;
        a2[2] = 2;

        int max1 = maxArray(a1);
        int max2 = maxArray(a2);
        System.out.println(max1);
        System.out.println(max2);
    }

}
