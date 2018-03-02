import java.io.IOException;

public class RandomWriter {
    public static void main(String[] args) throws IOException {
        java.io.File output = new java.io.File("Random.txt");
        if(!output.isFile())
            output.createNewFile();
        java.io.PrintWriter cout = new java.io.PrintWriter(output);
        for(int i = 0; i < 1000000; i++) {
            if(i % 10 != 0)
                cout.printf(" %.2f", Math.random() * 10);
            else
                cout.printf("\n %.2f", Math.random() * 10);

            if(i % 10 != 0)
            System.out.print(" " + i);
            else
                System.out.print("\n " + i);

        }
        cout.close();
    }
}
