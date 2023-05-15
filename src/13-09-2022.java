/*
Vivian Peng
ICS3U7-1, Ms. S
09/09/2022
Assignment 3; Sept 13 programing exercises: #9 page 45, #12 page 46 of Java booklet
*/
import java.util.Scanner;

public class Sept13HW {
    public static void main(String[] args){
        //exercise 9: prompts user for time in minutes then displays time in hours and minutes
        int time = 0;
        int timeInMinutes = 0;
        int timeInHours = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a time in minutes: ");
        time = scanner.nextInt();

        timeInMinutes = time%60;
        timeInHours = (time-timeInMinutes)/60;

        System.out.print("that is " + timeInHours + " hour(s) and " + timeInMinutes + " minute(s).");

        //exercise 12: user enters time taken on java project - designing, coding, debugging, testing
        //then displays table showing percentages of time taken for each part
        double designingTime = 0.0;
        double codingTime = 0.0;
        double debuggingTime = 0.0;
        double testingTime = 0.0;
        double totalTime = 0.0;

        System.out.print("\nenter the amount of time spent on each project task:\n");
        System.out.print("designing: ");
        designingTime = scanner.nextInt();

        System.out.print("coding: ");
        codingTime = scanner.nextInt();

        System.out.print("debugging: ");
        debuggingTime = scanner.nextInt();

        System.out.print("testing: ");
        testingTime = scanner.nextInt();

        scanner.close();

        totalTime = designingTime + codingTime + debuggingTime + testingTime;

        System.out.format("%-10s %10s", "task", "time\n");
        System.out.format("%-10s %10s", "designing", Math.round(designingTime/totalTime*10000)/100.0 + "%\n");
        System.out.format("%-10s %10s", "coding", Math.round(codingTime/totalTime*10000)/100.0 + "%\n");
        System.out.format("%-10s %10s", "debugging", Math.round(debuggingTime/totalTime*10000)/100.0 + "%\n");
        System.out.format("%-10s %10s", "testing", Math.round(testingTime/totalTime*10000)/100.0 + "%\n");
    }
}
