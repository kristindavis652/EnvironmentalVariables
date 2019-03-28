public class StringPractice {
    public static int countCharacters(String text) {
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            //System.out.print(text.charAt(i));
            if (text.charAt(i) == 'g') {
                count++;
            }
        }
            return count;


        }
        public static void main (String[]args) {
            System.out.println(countCharacters("hgeglglo"));
        }
    }

