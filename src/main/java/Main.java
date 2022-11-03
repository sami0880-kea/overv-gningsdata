import covid19Data.Covid19Data;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Covid19Data> covid19Data = new ArrayList<Covid19Data>();

        File f = new File("src/coviddata.csv");
        System.out.println("Program startet");
        try {
            Scanner sc = new Scanner(f, StandardCharsets.ISO_8859_1);
            while (sc.hasNext()) {
                String linje = sc.nextLine();
                String[] att = linje.split(",");

                Covid19Data indlæstData = new Covid19Data(
                        att[0],
                        att[1],
                        Integer.parseInt(att[2]),
                        Integer.parseInt(att[3]),
                        Integer.parseInt(att[4]),
                        Integer.parseInt(att[5]),
                        att[6]
                );
                covid19Data.add(indlæstData);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Fejl i kommunikation med fil");

        } catch (NumberFormatException e) {
            System.out.println("Fejl i filformat: " + e.getMessage());
        }

        System.out.println(covid19Data);
    }
}
