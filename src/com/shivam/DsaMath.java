package com.shivam;

import java.util.*;

public class DsaMath {
    public static void main(String[] args) {
        int n = 16; 

        int digits = (int)( Math.log(n) / Math.log(2)) + 1;
        System.out.println(digits);


        // Sum of Kth row of pascal's triangle

        /* what is pascals Triangle
         * 1                             ------> 2 ^ 0           
         * 1   1                         ------> 2 ^ 1
         * 1   2   1                     ------> 2 ^ 2
         * 1   3   3    1                ------> 2 ^ 3
         * 1   4   6    4    1           ------> 2 ^ 4
         * 1   5   10   10   5   1       ------> 2 ^ 5
         * 1   6   15   20   15  6   1   ------> 2 ^ 6   (n-1)
         * and soo on 
         */

         int k = 3; 
         System.out.print("SUM OF Kth ROW OF PASCALS TRIANGLE IS : " + (1<<(k-1)) + "\n");


         // if we have to check if a number is a power of 2 or not then there are multiple approcahes 

         /* 
          * 1. Right shift the value and count the number of 1's --> if the number of 1's is more than 1 then its not a power of two as
          *  power of 2 will looks like 1, 10, 100, 100001, 1000000
          * 
          * 2. x = (~x + 1) then power --> And the number by its 2's compliment and if the result is 0 then its a power. 
          *   x =  1 0 0 0 0 0 0 
          *
          *  ~x =  0 1 1 1 1 1 1
          *   +                1
          *       ---------------
          *        1 0 0 0 0 0 0  --> same as x
          * 
          * so in this case ~x = x-1
          *
          * SO, x & (x-1) = 0 --> then its power
          */
            // System.out.println(((n & (n - 1)) == 0));

            int x = 10; 
            int pow = 5; 
            int res = 1;

            while(pow>0){
                if((pow&1)==1){
                    res *=x;
                }

                x *=x;
                pow = pow>>1;
            }

            // System.out.println(res);


            // find the number of set bits in the number

            int num = 175;
            int counter = 0;
            while(num>0){
                counter++;
                num = ( num & (num-1) );
            }

            // System.out.println(counter);


            // [555,901,482,1771]
            System.out.println((((int) (Math.log(555) / Math.log(10)) + 1) & 1));
            System.out.println((((int) (Math.log(901) / Math.log(10)) + 1) & 1));
            System.out.println((((int) (Math.log(482) / Math.log(10)) + 1) & 1));
            System.out.println((((int) (Math.log(1771) / Math.log(10)) + 1) & 1));

System.out.println();
            System.out.println((((int) (Math.log10(555)) + 1) & 1));
            System.out.println((((int) (Math.log10(901)) + 1) & 1));
            System.out.println((((int) (Math.log10(482)) + 1) & 1));
            System.out.println((((int) (Math.log10(1771)) + 1) & 1));

    }
}
