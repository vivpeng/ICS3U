public class SeiveOfEratostheues {
    public static void main(String[] args){
        //Seive of Eratostheues - finds all primes until 100,000
        int n = 100000;

        boolean prime[] = new boolean[n+1];
        for(int i = 2; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++){
            if (prime[p]){
                for (int i = p*p; i <= n; i+=p)
                    prime[i] = false;
            }
        }

        for(int i =2; i <= n; i++){
            if (prime[i])
                System.out.println(i);
        }
    }
}
