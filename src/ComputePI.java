/*
Vivian Peng
11/10/2022, Ms. S
Assignment 6 Nested Loops #1
 */

public class ComputePI {
    public static void main(String[] args){
        double sum = 1;
        double denominator = 3;
        double pi;

        for(int i = 1; i < 100000; i++){
            if(i%2 == 0)
                sum += 1/denominator;
            else
                sum -= 1/denominator;
            denominator += 2;
        }
        pi = Math.round(sum*4*1000)/1000.0;
        System.out.print(pi);
    }
}
