import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileExtractor {

    public static void main(String[] args) {
        try {
            File input1 = new File(args[0]);
            File input2 = new File(args[1]);
            File input3 = new File(args[2]);
            File output1 = new File("compareInfo.txt");

            if(!output1.isFile()) {
                try {
                    output1.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            PrintWriter cout = new PrintWriter(output1);

            String inputText = "";
            final String endl = "\n";
            int counter1 = 0, counter2 = 0, counter3 = 0, wordcount1 = 0, charactercount1 = 0, sentencecount1 = 0, wordcount2 = 0, charactercount2 = 0, sentencecount2 = 0, wordcount3 = 0, charactercount3 = 0, sentencecount3 = 0;
            String Names1 = "", Names2 = "", Names3 = "";
            Scanner scanner1 = new Scanner(input1);
            Scanner scanner2 = new Scanner(input2);
            Scanner scanner3 = new Scanner(input3);

            scanner1.useDelimiter("\\.");
            scanner2.useDelimiter("\\.");
            scanner3.useDelimiter("\\.");
            Names1 = scanner1.nextLine();
            while(scanner1.hasNext()) {
                counter1++;
                sentencecount1++;
                charactercount1++;
                String unparsedString = scanner1.next();
                String[] ParsedString = unparsedString.split(" ");
                wordcount1 += ParsedString.length;
                for(String word : ParsedString){
                    charactercount1 += word.length();
                }
                charactercount1 += ParsedString.length - 1;
                wordcount1--;
           //     System.out.println("Line " + counter1 + ": " + unparsedString + ".");
            }
            //System.out.println(endl + endl + endl);
            Names2 = scanner2.nextLine();
            while(scanner2.hasNext()) {
                counter2++;
                sentencecount2++;
                charactercount2++;
                String unparsedString = scanner2.next();
                String[] ParsedString = unparsedString.split(" ");
                wordcount2 += ParsedString.length;
                for(String word : ParsedString){
                    charactercount2 += word.length();
                }
                charactercount2 += ParsedString.length - 1;
                wordcount2--;
               // System.out.println("Line " + counter2 + ": " + unparsedString + ".");
            }
          //  System.out.println(endl + endl + endl);
            Names3 = scanner3.nextLine();
            while(scanner3.hasNext()) {
                counter3++;
                sentencecount3++;
                charactercount3++;
                String unparsedString = scanner3.next();
                String[] ParsedString = unparsedString.split(" ");
                wordcount3 += ParsedString.length;
                for(String word : ParsedString){
                    charactercount3 += word.length();
                }
                charactercount3 += ParsedString.length - 1;
                wordcount3--;
            //    System.out.println("Line " + counter3 + ": " + unparsedString + ".");
            }
            wordcount1++;
            wordcount2++;
            wordcount3++;


            //System.out.println(scanner3.hasNext());
            cout.println(Names1 + ": ");
            cout.println("Word Count: " + wordcount1 + "\nCharacter count: " + charactercount1 + "\nSentence Count: " + sentencecount1);
            cout.println(endl + endl + endl);
            cout.println(Names2 + ": ");
            cout.println("Word Count: " + wordcount2 + "\nCharacter count: " + charactercount2 + "\nSentence Count: " + sentencecount2);
            cout.println(endl + endl + endl);
            cout.println(Names3 + ": ");
            cout.println("Word Count: " + wordcount3 + "\nCharacter count: " + charactercount3 + "\nSentence Count: " + sentencecount3);
            cout.close();
            System.out.println("Process has ended successfully, please check compareInfo.txt for output");
        }
        catch(IndexOutOfBoundsException IOBEx){
            System.out.println("Missing Entries, please enter all three file names space delimited");
        } catch (FileNotFoundException e) {
            System.out.println("Please make sure the file really exists");
            System.out.println(e.getMessage());
        }

    }


}
