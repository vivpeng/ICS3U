/*
Vivian Peng
11/10/2022, Ms. S
Assignment 6 Nested Loops #2, 3, 4, 5, 6
 */

public class Assignment6NestedLoops {
    public static void main(String[] args){
        //2.
        int input2 = 5;

        for(int row = input2; row > 0; row--){
            for(int column = 1; column <= row ; column++)
                System.out.print(column);
            System.out.print("\n");
        }

        //3.
        int input3 = 4;

        for(int row = input3; row > 0; row--){
            for(int column = input3; column > 0; column--){
                if(column > row)
                    System.out.print(" ");
                else
                    System.out.print(column);
            }
            System.out.print("\n");
        }

        //4.
        int n = 5;

        //first half
        for(int row1 = 1; row1 <= n; row1++){
            for(int column1 = 1; column1 <= row1; column1++)
                System.out.print("*");
            System.out.print("\n");
        }
        //second half
        for(int row2 = n-1; row2 > 0; row2--){
            for(int column2 = row2; column2 > 0; column2--)
                System.out.print("*");
            System.out.print("\n");
        }

        //5.
        String password = "";
        String operators = "!~$&@*%_";

        password += (char)('a' + Math.random()*26);
        password += (int)(Math.random()*10);
        password += (char)('A' + Math.random()*26);
        password += operators.charAt((int)(Math.random()*8));

        System.out.println(password);

        //6.
        String string = "The lyrics are not that poor!";

        int notIndex = string.indexOf("not"), goodIndex = string.indexOf("poor");

        if (notIndex > -1 && notIndex < goodIndex)
            System.out.println(string.replaceAll(string.substring(notIndex, goodIndex + 4),"good"));
        else
            System.out.print("error");
    }
}
