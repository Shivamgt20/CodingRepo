package com.shivam;

import java.util.*;

public class AddBinary {
    public static void main(String[] args) {
        String str1 = "111"; String str2 = "110";

        // System.out.println(BinarySum(str1, str2));
        // System.out.println(1<<31);
        System.out.println(reverseBits(10));
        // printBits(11);
    }

    private static String BinarySum(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        
        int i = str1.length()-1; int j = str2.length()-1;
        int carry = 0; 

        while(i>=0 || j>=0){
            int sum = carry;

            if (i>=0) {
                sum += str1.charAt(i) - '0';
            }
            if(j>=0){
                sum += str2.charAt(j) - '0';
            }

            // check the sum value and do operation 

            if(sum == 0 || sum == 1){
                carry = 0;
                result.append(sum);
            }else if(sum == 2){
                carry =1; 
                result.append("0");
            }else{
                result.append('1');
                carry=1;
            }
            i--;j--;
        }

        if (carry ==1) {
            result.append('1');
        }
        return result.reverse().toString();
    }


    private static int reverseBits(int n){
        // int rev = 0; 

        // for(int i =0; i<32; i++){
        //     if( ((n>>i) & 1) == 1 ) rev |= 1 << (31-i);
        // }

        // return rev;


        int rev = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1)
                rev |= 1 << (31 - i);
        }
        return rev;
    }


    private static void printBits(int n){
        boolean flag = false; 

        for(int i =31; i>=0; i--){
            int mask =  1<<i;

            // if(flag){
            //     if((n & mask) !=0 ){
            //         flag = true;
            //         System.out.print(1);
            //     }else{
            //         System.out.print(0);
            //     }
            // }else{
            //     if((n & mask) !=0 ){
            //         flag = true;
            //         System.out.print(1);
            //     }else{
            //         // System.out.print(0);
            //     }
            // }

            if((n & mask) !=0 ){
                // flag = true;
                System.out.print(1);
            }else{
                System.out.print(0);
            }
            
        }
        return; 
    }
}


// 00000000000000000000000000001011
// 00000000000000000000000000001011