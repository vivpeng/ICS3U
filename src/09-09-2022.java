/*
Vivian Peng
ICS3U7-1, Ms. S
09/09/2022
Homework on Sept 9th, question 4
Think about a number between 0 to 3000. Assign this value to a variable. This will be the amount of
money you have. If the cost of a ticket for a hockey game is $113.15, what is the maximum number of
tickets can be bought for the money you have? Calculate and display the change (separately dollars and
cents).
 */

public class Sept9HW {
    public static void main(String[] args) {
        double money = 2000;
        int maxTickets;
        double change;
        int changeDollars;
        int changeCents;

        maxTickets = (int)(money/113.15);
        change = money%113.15;
        changeDollars = (int)change;
        changeCents = (int) Math.round((change - changeDollars)*100);

        System.out.print("the max amount of tickets i can buy is " + maxTickets + " and i would receive " + changeDollars + " dollars and " + changeCents + " cents in change.");
    }
}
