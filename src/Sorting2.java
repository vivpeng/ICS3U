/*
Vivian Peng
20/10/2022, Ms. S
Sorting practice with words (using insertion sort)
 */

import java.io.*;
import java.util.Scanner;

public class Oct19 {
    public static void main(String[] args) throws Exception{
        Scanner scannerFile = new Scanner(new File("wordsToSort.txt"));
        String[] holidayWords = new String[15];

        for(int i = 0; i < 15; i++)
            holidayWords[i] = scannerFile.next();

        scannerFile.close();

        for(int i = 1; i < holidayWords.length; i++){
            String key = holidayWords[i]; //the key is the word we consume each iteration, it stays constant
            int j = i - 1; //j is the position of the words we check, it will change, so we can go through all the words before key

            while(j >= 0 && holidayWords[j].compareTo(key) > 0){ //checking if holidayWords[j] appears before key in alphabet
                holidayWords[j+1] = holidayWords[j]; //setting the larger word above the smaller
                j = j-1;
            }
            holidayWords[j+1] = key; //putting key where it belongs
        }
        for(int i = 0; i < holidayWords.length; i++)
            System.out.println(holidayWords[i]);
    }
}
