package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[4];
        int[] theArray;
        int runtime, numVal;
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        runtime = input.nextInt();

        for( int n = 0; n < runtime; n++){
            System.out.println("Enter a number");
            nums[n] = input.nextInt();
        }
        theArray = reverse(nums);
        System.out.println("Which number do you want to see?");
        numVal = input.nextInt();
        System.out.println("the value is " + theArray[numVal]);

    }




    public static int[] reverse (int[] n) {
        int[] array = new int[n.length];
        int j = n.length - 1;
        for(int i = 0; i < n.length; i++) {
        array[i] = n[j--];
        }
        return array;
    }

}
