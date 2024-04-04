package com.shivam;

public class KokoEatingBananas875 {
    public static void main(String[] args) {
        int start = Integer.MAX_VALUE; int end = Integer.MIN_VALUE; 

        int[] piles = {312884470}; int h = 312884469;

        for(int num : piles){
            start = Math.min(start, num);
            end = Math.max(end, num);
        }   
   
        int mid = 0;
   
        while(start!=end){
            mid = start + (end-start)/2;
            int hourCount = 0;
   
            for(int num : piles){
                if(num <= mid){
                    hourCount++;
                }else{
                    hourCount += (int)(num/mid) + 1;
                }
            }
   
            if(hourCount > h){
                start = mid +1;
            }else{
                end = mid;
            }
        }

        System.out.println(end);
    }
}
