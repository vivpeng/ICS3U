/*
03/11/2022
ICS3U7, Ms. S
Vivian Peng
Assignment 8:  Array and Methods Question 1 & Question 2
 */
import java.util.Scanner;

public class assignment8Q1Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //question 1: sum, min, isAllEven, isArithmetic, couldBeArithmetic
        System.out.println("~ QUESTION 1 ~");
        System.out.print("enter a line of numbers separated by a comma: ");
        String intsStr = scanner.nextLine();
        String[] arr = intsStr.split(", ");

        int[] arrInts = new int [arr.length];

        for(int i = 0; i < arr.length; i++)
            arrInts[i] = Integer.parseInt(arr[i]);

        System.out.println("min value is " + min(arrInts));
        System.out.println("sum is " + sum(arrInts));
        if(isAllEven(arrInts))
            System.out.println("all values are even");
        else
            System.out.println("NOT all values are even");
        if(isArithmetic(arrInts))
            System.out.println("this is an arithmetic sequence");
        else
            System.out.println("this is NOT an arithmetic sequence");
        if (couldBeArithmetic(arrInts))
            System.out.println("this can be rearranged to be an arithmetic sequence");
        else
            System.out.println("this can NOT be rearranged to be an arithmetic sequence");

        //question 2: wordCount, wordAvgLength
        System.out.println("~ QUESTION 2 ~");
        System.out.print("enter sequence of words: ");
        String str = scanner.nextLine();
        System.out.println("total words = " + wordCount(str));
        System.out.println("avg length = " + wordAvgLength(str));
    }

    //question 1 methods: sum, min, isAllEven, isArithmetic, couldBeArithmetic
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i])
                min = arr[i];
        }

        return min;
    }

    public static boolean isAllEven(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 1)
                return false;
        }
        return true;
    }

    public static boolean isArithmetic(int[] arr){
        int constantDiff = arr[0] - arr[1];
        for(int i = 1; i < arr.length-1; i++) {
            if (arr[i] - arr[i + 1] != constantDiff)
                return false;
        }
        return true;
    }

    public static boolean couldBeArithmetic(int[] arr) {
        int[] orderedArr = arr;

        int l = orderedArr.length;
        for(int i = 1; i < l; i ++){
            int key = orderedArr[i];
            int j = i -1;

            while (j>= 0 && orderedArr[j] > key) {
                orderedArr[j + 1] = orderedArr[j];
                j--;
            }
            orderedArr[j+1] = key;
        }

        return isArithmetic(orderedArr);
    }

    //question 2 methods: wordCount, wordAvgLength
    public static int wordCount(String str){
        String[] words = str.split(" ");
        return words.length;
    }

    public static double wordAvgLength(String str){
        String noSpaces = str.replaceAll(" ", "");
        return (double)noSpaces.length() / wordCount(str);
    }

}
