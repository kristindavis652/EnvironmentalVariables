import java.util.Scanner;

public class ThankYouMerge {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Thank You Letters");
        boolean anotherThankYou = true;


        while (anotherThankYou) {
            System.out.println("Enter name of donor: ");
            String personName = keyboard.nextLine();
            if (!personName.equals("quit")) {
                System.out.println("Enter donation amount: ");
                String donationAmount = keyboard.nextLine();

                System.out.println("Dear " + personName + ",\n" +
                        "Thank you for your donation! We rely on donors like you to keep our\n" +
                        "organization effective, and you came through for us. Your donation of $" + donationAmount + "\n" +
                        "will help our efforts to make a difference in the world.\n" +
                        "As you may know, we are a registered non-profit organization, so your\n" +
                        "donation is tax deductible. You may use this letter as a receipt for tax\n" +
                        "purposes.\n" +
                        "Thank you again for your support!\n" +
                        "Sincerely,\n" +
                        "Paula Jones\n" +
                        "YourCharity.org\n");


                } else {
                break;
            }
            }


        }
    }




