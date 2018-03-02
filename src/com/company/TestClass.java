import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        String input1;
        int counterTotal = 0;
        Scanner input = new Scanner(System.in);
        String[][] names = new String[30][2];
        float[][] pay = new float[30][3];
        int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0;


        //information gathering loop with simulated if's using while loops
        //completely within specs for project
        do {
            counter1 = 0; counter2 = 0; counter3 = 0; counter4 = 0;
            names[counterTotal][0] = "";
            while (counter1 < 1 && !names[counterTotal][0].equals("end")) {
                System.out.println("Please enter first name or end to end program");
                names[counterTotal][0] = input.next();
                counter1 = 1;
            }
            while (counter2 < 1 && !names[counterTotal][0].equals("end")) {
                System.out.println("Please enter last name ");
                names[counterTotal][1] = input.next();
                counter2 = 1;
            }
            while (counter3 < 1 && !names[counterTotal][0].equals("end")) {
                System.out.println("Please enter hourly rate");
                pay[counterTotal][0] = input.nextFloat();
                counter3 = 1;
            }
            while (counter4 < 1 && !names[counterTotal][0].equals("end")) {
                System.out.println("Please enter hours");
                pay[counterTotal][1] = input.nextFloat();
                counter4 = 1;
            }


        } while (!names[counterTotal++][0].equals("end"));
    payrate(pay);
    outputArray(names, pay);

    }
    //requires two dimensional float array in
    //generates payout and inserts said payout to third column in array
   static void payrate(float[][] payArray) {
        for(int h = 0; h < payArray.length; h++) {
            for (int i = 0; i < payArray[h].length; i++) {
               payArray[h][2] =  payArray[h][0] * payArray[h][1];
            }
        }
    }
    //function to generate output table in nice format
    //requires two dimensional array for names and
    //two dimensional array for pay
    //outputs nothing and prints table to terminal
    static void outputArray(String[][] names, float[][] pay) {

        System.out.println("|-------------|------------|-----------|");
        System.out.println("|  Last Name  | First Name |  Net Pay  |");
        System.out.println("|-------------|------------|-----------|");

        for (int i = 0; i < names.length; i++) {
            if (pay[i][2] == 0) { break; }
            System.out.print("|   ");
            System.out.print(names[i][1]);
            for (int j = 0; j < (10 - names[i][1].length()); j++) {
                System.out.print(" ");
            }
            System.out.print("|  ");
            System.out.print(names[i][0]);
            for (int j = 0; j < (10 - names[i][0].length()); j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.printf("  $%.2f", pay[i][2]);
            if(pay[i][2] < 1000) {
                for (int j = 0; j < (9 - 7); j++){
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.print("\n|-------------|------------|-----------|\n");

            }
            if(pay[i][2] >= 1000) {
                for (int j = 0; j < (9 - 8); j++){
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.print("\n|-------------|------------|-----------|\n");

            }

        }

    }

    }


