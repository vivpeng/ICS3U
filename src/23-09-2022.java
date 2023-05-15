/*
Vivian Peng
ICS3U7-1, Ms. S
23/09/2022
java booklet page 93 #5, 7
 */
import java.util.Scanner;

public class Sept23HW {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //exercise 5 page 93
        //ask user for positive int and display each digit on separate line
        int posInt;

        System.out.print("enter a positive int: ");
        posInt = scanner.nextInt();

        while (posInt > 0) {
            System.out.println(posInt%10);
            posInt /= 10;
        }

        //exercise 7 a) page 93
        //ask user for positive int and display sum of cubes of digits
        int posInt2;
        int sum = 0;

        System.out.print("enter a positive int: ");
        posInt2 = scanner.nextInt();

        scanner.close();

        while (posInt2 > 0) {
            sum += Math.pow(posInt2%10, 3);
            posInt2 /= 10;
        }

        System.out.println("the sum of the cubes of the digits is " + sum);

        //exercise 7 b) page 93
        //determine what ints of 2, 3, 4 digits are equal to the sum of the cubes of their digits
        int placeholderI;

        System.out.println("ints of 2, 3, 4 digits that are equal to the sum of their cubes:");

        for (int i = 10; i < 10000; i++){
            int sum2 = 0;
            placeholderI = i;
            while (placeholderI > 0){
                sum2 += Math.pow(placeholderI%10,3);
                placeholderI /= 10;
            }
            if (sum2 == i)
                System.out.println(i);
        }
    }
}
