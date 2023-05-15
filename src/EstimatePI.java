package src;/*
Vivian Peng
13/10/2022, Ms. S
Estimate PI
 */

public class Oct13EstimatePI {
    static boolean hasCommonFactor(int num1, int num2){
        for(int i = 2; i <= Math.min(num1, num2); i++){
            if(num1%i == 0 && num2%i == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        int N = 5;
        String numbersString = "2 3 4 5 6";
        String[] numbers = new String(numbersString).split(" "); //converting numbersString to array

        int noCommonFactorPairs = 0, pairs = 0;

        for(int i = 0; i < N; i++){
            for(int j = i+1; j<N; j++){
                if (!(hasCommonFactor(Integer.parseInt(numbers[i]), Integer.parseInt(numbers[j]))))
                    noCommonFactorPairs++;
                pairs ++;
            }
        }
        System.out.print(Math.round(Math.sqrt(6.0 / noCommonFactorPairs * pairs) * 100000) / 100000.0);
    }
}
