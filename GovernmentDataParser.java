import java.io.*;

public class GovernmentDataParser {
    public static void main(String[] args) {
        BufferedReader in = null;
        PrintWriter output = null;
        try {
            in
                    = new BufferedReader(new FileReader("https.txt"));
            String line = "";
            int executiveSites = 0;
            int judicialSites = 0;
            int legislativeSites = 0;
            int executiveHttps = 0;
            int judicialHttps = 0;
            int legislativeHttps = 0;

            while (in.readLine() != null) {
                line.split("\t");
                String[] columns = line.split("\t");

                if (columns[2].equals("executive")) {
                    executiveSites++;
                    if (columns[5].equals("Yes")) {
                        executiveHttps++;
                    }
                }

                if (columns[2].equals("judicial")) {
                    judicialSites++;
                    if (columns[5].equals("Yes")) {
                        judicialHttps++;

                    }
                }

                if (columns[2].equals("legislative")) {
                    legislativeSites++;
                    if (columns[5].equals("Yes")) {
                        legislativeHttps++;
                    }

                }

                double executivePercent = (double)executiveHttps / executiveSites;
                double judicialPercent = judicialHttps / judicialSites;
                double legislativePercent = legislativeHttps / legislativeSites;

                output = new PrintWriter("uses_https.txt");
                output.println("branch\t+total_sites\tuses_https\tpercent_https");
                output.println("executive\t+executive_sites\t+executiveHttps\t+executivePercent_https");
                output.println("judicial\t+judicial_sites\t+judicialHttps\t+judicialPercent_https");
                output.println("legislative\t+legislative+sites\t+legislativeHttps\t+legislativePercent_https");


            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("There was a problem reading the file.");
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
                if (output != null) {
                    output.close();
                }

            }
        }
    }
}
