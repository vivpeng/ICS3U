/*
Vivian Peng
19/10/2022, Ms. S
Sorting Practice with Integers (using selection sort)
 */

import java.io.*;
import java.util.Scanner;

public class Oct18SortingHW {
    public static void main(String[] args) throws Exception{
        int integer;
        int[] hundredInts = new int[100];

        String fileName = "hundredIntsToSort.txt";
        Scanner scannerFile = new Scanner(new File(fileName)); //scans file instead of input

        //making array with file integers
        for(int i = 0; i < 100; i++){
            integer = scannerFile.nextInt();
            hundredInts[i] = integer;
        }
        scannerFile.close();

        for(int i = 0; i < hundredInts.length; i++) {//boundary
            //finding minimum element
            int minElement = i;
            for (int j = i+1; j < hundredInts.length; j++){
                if (hundredInts[j] < hundredInts[minElement])
                    minElement = j;
            }
            //swapping minimum with first
            int temp = hundredInts[minElement];
            hundredInts[minElement] = hundredInts[i];
            hundredInts[i] = temp;
        }

        //printing
        for(int i = 0; i < hundredInts.length; i++)
            System.out.println(hundredInts[i]);
    }
}
