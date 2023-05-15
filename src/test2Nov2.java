/*
02/11/2022
ICS3U7, Ms. S
Vivian Peng
 */
import java.util.Scanner;

public class test2Nov2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String letters = "", reordered = "";

        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if (Character.isLetter(ch))
                letters += ch;
        }

        int length = letters.length(); //needs variable to hold oiriginal length

        while(reordered.length() < length) {
            char min = letters.charAt(0); //looking for LARGEST letter (smallest in ascii)

            for (int i = 0; i < letters.length(); i++) {
                if ((int) letters.charAt(i) < (int) min)
                    min = letters.charAt(i);
            }
            reordered += min;

            String minString = "";
            minString += min;
            letters = letters.replaceFirst(minString, "");

        }

        System.out.println(text);
        int j = -1;
        for(int i = 0; i < text.length(); i++){
            if (Character.isLetter(text.charAt(i))) {
                j++;
                System.out.print(reordered.charAt(j));
            }
            else if (text.charAt(i) == ' ')
                System.out.print(" ");
            else
                System.out.print(text.charAt(i));
        }
    }
}
