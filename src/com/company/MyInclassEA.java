
import java.util.InputMismatchException;
import java.util.Scanner;


public class MyInclassEA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num1, num2, results;
        try {
            System.out.println("First Integer: ");
            if(input.hasNextInt())
                num1 = input.nextInt();
            else
            throw new InputMismatchException("WRONG try again ... maybe with an integer this time");


            System.out.println("Second Integer: ");
            if(input.hasNextInt())
                num2 = input.nextInt();
            else
                throw new InputMismatchException("WRONG try again ... maybe with an integer this time");
            if (num2 == 0) {
                throw new ArithmeticException("Sorry mario your princess is in another castle. No zeros");
            } else {
                results = num1 / num2;
                System.out.println("your result is " + results);
            }
        } catch (ArithmeticException ArithEx) {
            System.out.println(ArithEx.getMessage());
        }
        catch (InputMismatchException InputEx) {
            System.out.println(InputEx.getMessage());
        }


    }
}
