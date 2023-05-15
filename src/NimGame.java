/*
Vivian Peng
25/10/2022, Ms. S
java booklet pg 138 exercise 9; nim game
 */
import java.util.Scanner;

public class assignment7NimGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int gamesPlayed = 0;
        String playAgain = "y";

        while (playAgain.equals("y") || playAgain.equals("Y")) {
            int numOfStones = (int)(Math.random()*16)+15;

            System.out.println("there are " + numOfStones + " stones");
            String winner = "me"; //default unless changed
            String loser = "you"; //default unless changed

            while (numOfStones != 1) {
                numOfStones -= userTurn(numOfStones);
                System.out.println("there are now " + numOfStones + " stones");
                if (numOfStones == 1) {
                    winner = "you";
                    loser = "i";
                    break;
                }

                int stonesDrawn = drawStones(numOfStones);
                numOfStones -= stonesDrawn;
                System.out.println("i drew " + stonesDrawn + " stone(s)");
                System.out.println("there are now " + numOfStones + " stones");
            }
            System.out.println("guess " + loser + " have to draw the last stone ):");
            System.out.println("the winner is " + winner + "!");

            gamesPlayed++;

            System.out.print("do you want to play again? y/n: ");
            playAgain = scanner.next();
        }
        System.out.print("alright...bye! we played " + gamesPlayed + " game(s)");
    }

    public static boolean isValidEntry(int input, int numOfStones) {
        if(input < numOfStones && input <= 3 && input > 0)
            return true;
        return false;
    }

    public static int userTurn(int numOfStones){
        System.out.print("how many stones would you like to take? ");
        int userTakes = scanner.nextInt();

        while (!isValidEntry(userTakes, numOfStones)) {
            System.out.print("that is not a valid value, try again: ");
            userTakes = scanner.nextInt();
        }
        return userTakes;
    }

    public static int drawStones(int numOfStones){
        int draw;
        if (numOfStones > 4)
            draw = (int) (Math.random() * 3) + 1;
        else if (numOfStones == 4)
            draw = 3;
        else if (numOfStones == 3)
            draw = 2;
        else if (numOfStones == 2)
            draw = 1;
        else
            draw = 1;
        return draw;
    }
}
