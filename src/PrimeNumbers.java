/*
Vivian Peng
17/10/2022, Ms. S
 */
import java.util.Scanner;

public class Oct17PrimeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean[] numB =  new boolean[100000];

        for (int i = 0; i < numB.length; i++)
            numB[i] = true;

        for(int i = 2; i < numB.length; i++){
            for(int j = i+1; j< numB.length; j++) {
                if (numB[i] && numB[j] && j % i == 0)
                    numB[j] = false;
            }
        }
        System.out.println("which number would you like to check the prime of? ");
        int num = scanner.nextInt();
        System.out.print(numB[num]);
    }
}
