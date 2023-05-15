/*
Vivian Peng
14/10/2022, Ms. S
Create 2d array (3x3), populated with "."s. Ask user where to put X. Print updated array.
 */
import java.util.Scanner;

public class Oct14TicTacToe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int putXW = 0;
        int putXH = 0;

        char[][] ticTac = {{'.', '.', '.'}, {'.', '.', '.'}, {'.', '.', '.'}};

        while(putXW != -1) {
            for(int i = 0; i<ticTac.length; i++) {
                for(int j = 0; j < ticTac[i].length; j++)
                    System.out.print(ticTac[i][j]);
                System.out.print("\n");
            }
            putXW = scanner.nextInt();
            putXH = scanner.nextInt();

            ticTac[putXH][putXW] = 'x';
        }
    }
}
