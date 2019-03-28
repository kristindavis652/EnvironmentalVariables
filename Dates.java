import static java.lang.System.out;
public class Dates
{
    // --- add methods here to make the program work ---
    public static String formatNumberAsTwoDigits(int number) {
        if (number < 10) {
            return "0" + number;
        } else {
            return "" + number;
        }
    }
    // formatNumberAsTwoDigits
    // nameFormat
    public static String nameFormat(int year, int month, int day) {
        if (month == 1) {
            return "January";
        } else if (month == 2) {
            return "February";
        } else if (month == 3) {
            return "March";
        } else if (month == 4) {
            return "April";
        } else if (month == 5) {
            return "May";
        } else if (month == 6) {
            return "June";
        } else if (month == 7) {
            return "July";
        } else if (month == 8) {
            return "August";
        } else if (month == 9) {
            return "September";
        } else if (month == 10) {
            return "October";
        } else if (month == 11) {
            return "November";
        } else if (month == 12) {
            return "December";
        }
        return null;
    }



    // slashFormat
    public static String slashFormat(int year, int month, int day) {
            String monthStr = formatNumberAsTwoDigits(month);
            String dayStr = formatNumberAsTwoDigits(day);
            return monthStr + "/" + dayStr + "/" + year;
    }
    // dashFormat
    public static String dashFormat(int year, int month, int day) {
            String monthStr = formatNumberAsTwoDigits(month);
            String dayStr = formatNumberAsTwoDigits(day);
            return monthStr + "-" + dayStr + "-" + year;
    }
    // don't change this code.
    public static void printDate(int year, int month, int day) {
 System.out.println(nameFormat(year, month, day));
 System.out.println(slashFormat(year, month, day)); System.out.println(dashFormat(year, month, day));
 System.out.println(); }
// don't change this code.
public static void main(String[] args) {
 System.out.println(formatNumberAsTwoDigits(3));
         System.out.println(formatNumberAsTwoDigits(9)); System.out.println(formatNumberAsTwoDigits(10));
         System.out.println(formatNumberAsTwoDigits(12));
         printDate(2014, 10, 4);
         printDate(2015, 1, 1); printDate(2013, 12, 31); }}


