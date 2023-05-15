/*
Vivian Peng
ICS3U7-1, Ms. S
09/09/2022
Assignment 1 questions 1 & 2
 */

public class Sept9HW2 {
    public static void main(String[] args) {
        //1. Write a java program that displays your name as ASCII graphics
        System.out.print(
                "        (_)     (_)            \n" +
                " __   _____   ___  __ _ _ __  \n" +
                " \\ \\ / / \\ \\ / / |/ _` | '_ \\ \n" +
                "  \\ V /| |\\ V /| | (_| | | | |\n" +
                "   \\_/ |_| \\_/ |_|\\__,_|_| |_|\n");

        //2. Write a program that displays your timetable.
        System.out.format("%-10s %-10s %20s", "Day 1", "Day 2", "Time\n");
        System.out.format("%-10s %-10s %20s", "CHC2D7-1", "ICS3U7-1", "09:00AM - 10:20AM\n");
        System.out.format("%-10s %-10s %20s", "ICS3U7-1", "CHC2D7-1", "10:25AM - 11:40AM\n");
        System.out.format("%-10s %-10s %20s", "ENG2D7-4", "FSF2D7-4", "12:40PM - 1:55PM\n");
        System.out.format("%-10s %-10s %20s", "FSF2D7-4", "ENG2D7-4", "02:00PM - 3:15PM\n");
    }
}
