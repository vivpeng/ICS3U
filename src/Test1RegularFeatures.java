/*
Vivian Peng
03/10/2022
ICS3U7, Ms. S
Test 1: A. Regular Features + B. Account Number Bonus
 */

import java.util.Scanner;

public class Test1RegularFeatures {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter a password: ");
        int password = scanner.nextInt();

        if (password != 123)
            System.out.print("Password is incorrect.\nGoodbye.");
        else{
            int accNum = (int)(Math.random()*100000) + 1;
            double accBal = (((int)(Math.random()*15001) - 5000)/100.00); //needs to be 15001 not 15000 to get # to 15000
            int transactions = (int)(Math.random()*13);

            String accStatus;
            if (transactions == 0)
                accStatus = "Inactive";
            else{
                if(accBal >= 0)
                    accStatus = "Positive balance";
                else
                    accStatus = "Negative balance";
            }

            boolean bonus = false; //will stay false UNLESS the if(sum%10 ==0) is true
            int sum = 0;
            int accNumHolder = accNum; //creating placeholder for accNum so the real accNum doesn't get changed

            while(accNumHolder != 0) {
                sum += accNumHolder % 10;
                accNumHolder /= 10;
            }

            if (sum%10 == 0)
                bonus = true;

            System.out.println("Last Name: " + lastName);
            System.out.println("First Name: " + firstName);
            System.out.println("Account Number: " + accNum);
            System.out.println("Balance: $" + accBal);
            System.out.println("Number of last month transactions: " + transactions);
            System.out.println("Account status: " +accStatus);
            if(bonus)
                System.out.println("You will get a $25 bonus the next time you use your account.");
        }
    }
}
