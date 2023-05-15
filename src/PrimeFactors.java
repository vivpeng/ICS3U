/*
Vivian Peng
ICS3U7-1, Ms. S
28/09/2022
pg 92 exercise 2 - PrimeFactors
 */

import java.util.Scanner;

public class Sept28PrimeFactors {
    public static void main(String[] args){
        int counter = 2;
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        number = scanner.nextInt();

        while (counter <= number) {
            if (number % counter == 0) {
                System.out.println(counter);
                number /= counter;
            } else
                counter++;
        }
    }
}
