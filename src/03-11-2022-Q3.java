/*
03/11/2022
ICS3U7, Ms. S
Vivian Peng
Assignment 8: Array and Methods Question 3
 */
import java.util.Scanner;

public class assignment8Q3 {
    public static void main(String[] args) {
        //define and populate array
        int[] cards = new int[52];
        for (int i = 0; i < 52; i++)
            cards[i] = i;

        //print array
        System.out.println("this is the int array: ");
        for (int i = 0; i < cards.length; i++)
            System.out.print(cards[i] + " ");
        System.out.println();

        //printing array as all cards
        System.out.println("these are all the cards: ");
        for (int i = 0; i < cards.length; i++)
            System.out.print(toString(cards[i]) + " ");
        System.out.println();

        //printing array as values
        System.out.println("these are all the card values: ");
        for (int i = 0; i < cards.length; i++)
            System.out.print(getValue(cards[i]) + " ");
        System.out.println();

        shuffle(cards);

        //printing array as all cards after shuffle
        System.out.println("these are the cards after being shuffled: ");
        for (int i = 0; i < cards.length; i++)
            System.out.print(toString(cards[i]) + " ");
    }

    public static void shuffle(int[] arr){
        //non primitive
        for(int i = 0; i < arr.length; i++){
            int randomIndex = (int)(Math.random()*51)+1;
            int placeholder = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = placeholder;
        }
    }

    public static String toString(int cardNum){
        String suit, value = "";
        int suitNum = cardNum / 13;
        if(suitNum == 0)
            suit = "♥";
        else if(suitNum ==1)
            suit = "♦";
        else if(suitNum ==2)
            suit = "♠";
        else
            suit = "♣";

        int intValue = cardNum % 13;
        if (intValue == 11)
            value = "J";
        else if(intValue == 12)
            value = "Q";
        else if(intValue == 0)
            value = "K";
        else if(intValue == 1)
            value = "A";
        else
            value += intValue;

        return value + suit;
    }

    public static int getValue(int cardNum){
        int remainder = cardNum % 13;
        int value;
        if (remainder == 0 || remainder == 11 || remainder == 12)
            value = 10;
        else
            value = remainder;

        return value;
    }
}
