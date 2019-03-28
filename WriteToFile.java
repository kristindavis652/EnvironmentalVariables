import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class WriteToFile {

    public static void writeToFile(String fileName, ArrayList<String> students) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(
                    new File(fileName)));
            for(int i = 0; i < students.size(); i++) {
                pw.println(students.get(i));
            }
        } catch (IOException io) {
            throw new RuntimeException(io);
        } finally {
            pw.close();
        }

    }



    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String fileName;

        String student;
        boolean anotherStudent = true;
        ArrayList<String> students = new ArrayList<>();


        System.out.println("Student Name List");
        System.out.println("Please enter the filename to save to: ");
        fileName = keyboard.next();

        System.out.println("");



        while(anotherStudent) {
            System.out.println("Student: ");
            student = keyboard.nextLine();
            if(student.equals("quit")) {
                break;
            } else {
                students.add(student);

            }



            }
            writeToFile(fileName, students);
            for(int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));




            }



        }







        }








