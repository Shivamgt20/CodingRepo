package com.shivam;

public class MathForDSA {
    public static void main(String[] args) {
        primeTillN(40);
        sqrt(40);

    }

    private static void primeTillN(int n){
        boolean[] primes = new boolean[n+1];

        for(int i = 2; i*i<=n; i++){
            if(!primes[i]){
                for(int j = 2*i; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }

        for(int i = 2; i<primes.length; i++){
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    private static void sqrt(int n ){
        int start = 1, end = n/2 , mid=-1;

        while(start <= end){
            mid = start + (end-start)/2;
            if(mid*mid == n){
                break;
            }
            if(mid*mid<n){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }

        double root = mid, incr = 0.1;

        for(int i = 0; i<3; i++){
            while(root*root<=n){
                root += incr;
            }
            root -= incr; incr/=10;
        }

        System.out.println(root);
    }


    
}
