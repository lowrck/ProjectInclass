package com.company;

public class extraClass {

    static String outputArray(String[][] names, float[][] pay) {
        String output = "";
        output += "|-------------|------------|-----------|\n";
        output += "|  Last Name  | First Name |  Net Pay  |\n";
        output += "|-------------|------------|-----------|\n";

        for (int i = 0; i < names.length; i++) {
            if (pay[i][2] == 0) { break; }
            output += "|   ";
            output += names[i][1];
            for (int j = 0; j < (10 - names[i][1].length()); j++) {
                output += " ";
            }
            output +="|  ";
            output +=names[i][0];
            for (int j = 0; j < (10 - names[i][0].length()); j++) {
                output +=" ";
            }
            output += "|  ";
            output +=  pay[i][2];
            if(pay[i][2] < 1000) {
                for (int j = 0; j < (9 - 7); j++){
                    output +=" ";
                }
                output +="|";
                output +="\n|-------------|------------|-----------|\n";

            }
            if(pay[i][2] >= 1000) {
                for (int j = 0; j < (9 - 8); j++){
                    output += " ";
                }
                output +="|";
                output +="\n|-------------|------------|-----------|\n";

            }

        }
        return output;
    }
}
