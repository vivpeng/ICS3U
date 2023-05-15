/*
Vivian Peng
ICS3U7-1, Ms. S
18/09/2022
Assignment 3; #1 pg 64, #6 pg 65
 */
import java.util.Scanner;

public class Sept18HW {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //example 1 page 64
        //prompts user for number of copies to print & displays price per copy & total price
        int numCopies = 0;
        double price = 0.0;

        System.out.print("enter the number of copies to be printed: ");
        numCopies = scanner.nextInt();

        if(numCopies < 0) {
            System.out.print("that is not possible");
        } else if(numCopies <= 99) {
            price = 0.30;
            System.out.println("price per copy is: $" + price);
            System.out.println("total price is: $" + price*numCopies);
        } else if(numCopies <= 499) {
            price = 0.28;
            System.out.println("price per copy is: $" + price);
            System.out.println("total price is: $" + price*numCopies);
        } else if(numCopies <= 749) {
            price = 0.27;
            System.out.println("price per copy is: $" + price);
            System.out.println("total price is: $" + price*numCopies);
        } else if(numCopies <= 1000) {
            price = 0.26;
            System.out.println("price per copy is: $" + price);
            System.out.println("total price is: $" + price*numCopies);
        } else {
            price = 0.25;
            System.out.println("price per copy is: $" + price);
            System.out.println("total price is: $" + price*numCopies);
        }

        //example 6 page 65
        //randomly generates 2 numbers (1~10) & and an operator (*, +, -, /) & asks user for answer & checks
        int num1;
        int num2;
        int signNumber;
        double userAnswer;
        double answer;
        char sign;

        num1 = (int)(Math.random()*10+1);
        num2 = (int)(Math.random()*10+1);
        signNumber = (int)(Math.random()*4);
        if(signNumber == 0) {
            sign ='*';
            answer = num1*num2;
        } else if(signNumber == 1){
            sign = '+';
            answer = num1+num2;
        } else if(signNumber == 2){
            sign = '-';
            answer = num1-num2;
        } else{
            sign = '/';
            answer = (double)num1/(double)num2;
        }

        System.out.print("What is " + num1 + sign + num2 + "? ");
        userAnswer = scanner.nextDouble();

        scanner.close();

        if(userAnswer != answer){
            System.out.print("your answer is wrong, the correct answer is " + answer);
        }
        else{
            System.out.print("correct!");
        }

    }
}
