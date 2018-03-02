package com.company;

import java.util.Scanner;

/**
 * generates list of pay rates with inputted hours, pay rate, and full name
 */
public class EmployeeWriter {
    public static void main(String[] args) throws java.io.IOException {
        java.io.File inputFile = new java.io.File("EmployeePay.txt");
        java.io.File outputFile = new java.io.File("roster.txt");
        java.io.PrintWriter cout = new java.io.PrintWriter(outputFile);
        if(!outputFile.isFile()) {outputFile.createNewFile();}
        String input1;
        int counterTotal = 0;
        Scanner input = new Scanner(inputFile);
        String[][] names = new String[30][2];
        float[][] pay = new float[30][3];
        int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0;


        //information gathering loop with simulated if's using while loops
        //completely within specs for project
        do {
            counter1 = 0; counter2 = 0; counter3 = 0; counter4 = 0;
            names[counterTotal][0] = "";
            while (counter1 < 1 && !names[counterTotal][0].equals("end")) {
                names[counterTotal][0] = input.next();
                counter1 = 1;
            }
            while (counter2 < 1 && !names[counterTotal][0].equals("end")) {
                names[counterTotal][1] = input.next();
                counter2 = 1;
            }
            while (counter3 < 1 && !names[counterTotal][0].equals("end")) {
                pay[counterTotal][0] = input.nextFloat();
                counter3 = 1;
            }
            while (counter4 < 1 && !names[counterTotal][0].equals("end")) {
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
    static void outputArray(String[][] names, float[][] pay) throws java.io.IOException {
        java.io.File outputFile = new java.io.File("roster.txt");
        java.io.PrintWriter cout = new java.io.PrintWriter(outputFile);
        for(int i = 0; i < names.length; i++) {
            if(pay[i][2] == 0) {break;}
            cout.printf("%s %s $%.2f \n", names[i][1], names[i][0], pay[i][2]);
        }
    cout.close();
    System.out.println("Employee data added to roster.txt");

    }

    }


