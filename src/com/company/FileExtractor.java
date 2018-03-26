import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExtractor {

    public static void main(String[] args) {
        try {
            File input1 = new File(args[0]);
            File input2 = new File(args[1]);
            File input3 = new File(args[2]);
            String inputText = "";
            final String endl = "\n";
            int counter1 = 0, counter2 = 0, counter3 = 0;
            Scanner scanner1 = new Scanner(input1);
            Scanner scanner2 = new Scanner(input2);
            Scanner scanner3 = new Scanner(input3);
            Scanner dummyscanner = new Scanner(input3);

            scanner1.useDelimiter("\\.");
            scanner2.useDelimiter("\\.");
            //scanner3.useDelimiter("\\.");
            System.out.println(scanner1.next());
            while(scanner1.hasNext()) {
                counter1++;
                System.out.println("Line " + counter1 + ": " + scanner1.next() + ".");
            }
            System.out.println(endl + endl + endl);
            System.out.println(scanner2.next());
            while(scanner2.hasNext()) {
                counter2++;
                System.out.println("Line " + counter2 + ": " + scanner2.next() + ".");
            }
            System.out.println(endl + endl + endl);
//            System.out.println(scanner3.next());
            while(scanner3.hasNext()) {
                counter3++;
                System.out.println("Line " + counter3 + ": " + scanner3.next() + ".");
            }
            //System.out.println(dummyscanner.hasNext());
            System.out.println(endl + endl + endl);
        }
        catch(IndexOutOfBoundsException IOBEx){
            System.out.println("Missing Entries, please enter all three file names space delimited");
        } catch (FileNotFoundException e) {
            System.out.println("Please make sure the file really exists");
            System.out.println(e.getMessage());
        }

    }
}
