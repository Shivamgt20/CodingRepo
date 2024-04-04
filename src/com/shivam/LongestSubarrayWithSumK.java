package com.shivam;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,1,1,1,3,3};
        int k = 6; 

        System.out.println(longestSubarrayWithSumK(a,k));
    }

    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here

        long sum = 0; int maxLen = 0;
        int start =0, end =0;
        while(end<a.length){

            while (start <= end && sum > k){
                sum -=a[start];
                start++;
            }

            if(sum == k ){
                maxLen = Math.max(maxLen, end-start);
            }

            end++;

            if(end<a.length)
            sum +=a[end];
            // end++;
        }

        return maxLen;

    }
}
