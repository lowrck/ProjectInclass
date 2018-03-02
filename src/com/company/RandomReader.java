import java.io.IOException;

public class RandomReader {

    public static void main(String[] args) throws IOException {
        java.io.File output = new java.io.File("Random.txt");
        float fileIn[] = new float[2000000];
        int counter1 = 0, counter2 = 1;
        java.util.Scanner fileInput = new java.util.Scanner(output);
        System.out.println(fileInput.hasNext());
        while(fileInput.hasNext()) {
            fileIn[counter1] = fileInput.nextFloat();
            counter1++;
        }
        for(float fileText : fileIn) {
            if(fileText == 0) break;
            if(fileText < 3 || fileText > 7) {
                if (counter2 % 10 != 0)
                    System.out.print(" " + fileText);
                else
                    System.out.print("\n " + fileText);
                counter2++;

            }
        }
    System.out.print("\n\n\n " + counter2);
    }
}
