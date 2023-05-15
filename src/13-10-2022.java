/*
Vivian Peng
13/10/2022, Ms. S
Array Practice
 */

public class Oct13Practice {
    public static void main(String[] args){
        //array of 15 random integer (0 - 100), print all and then print 1st and last value

        int[] randomInts = new int[15];
        for(int i = 0; i < 15; i++) {
            randomInts[i] = (int) (Math.random() * 101);
            System.out.println(randomInts[i]);
        }
        System.out.println("first int: " + randomInts[0]);
        System.out.println("last int " + randomInts[14]);
    }
}
