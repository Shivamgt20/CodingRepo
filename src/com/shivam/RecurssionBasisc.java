package com.shivam;

public class RecurssionBasisc {
    public static void main(String[] args) {
        
        //fibonnaci number nth

        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // System.out.println(binarySearch(0, arr.length-1, arr, 11));

        int[] nums = {-4,-1,0,3,10};
        System.out.println(sortedSquares(nums));

    }

    private static int fibo(int n ){

        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }


    private static int binarySearch(int start, int end, int[] arr, int target){
        // base condition

        if(start>end){
            return -1;
        }

        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }else{
            if(arr[mid] > target){
                return binarySearch(start, mid-1, arr, target);
            }else{
                return binarySearch(mid+1, end, arr, target);
            }
        }
    }



    public int maxOperations(int[] nums) {
        int ans = 1;
   
        for(int i =2; i<=nums.length -1; i+=2){
   
           if(nums[i]+nums[i+1] == nums[0]+nums[1]) ans++;
        }   
   
        return ans;
       }


       public static int[] sortedSquares(int[] nums) {

        int i = 0, j = nums.length - 1;

        while (i < j) {
            // check for negative and convert it to postive

            if (nums[i] < 0) {
                nums[i] = -1 * nums[i];
            }

            if (nums[j] < 0) {
                nums[j] = -1 * nums[j];
            }

            if (nums[i] > nums[j]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            j--;
        }

        return nums;
    }


}
