package com.shivam;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
    int Target = 12;
    int start = 0; 
    int end = arr.length-1;
    int mid = 0;

    Boolean isAcs = arr[0] < arr[arr.length-1];

    while(start<=end){
        // mid  = (start+end)/2;  ---> Better way to write this is as follows 

        mid = start + (end-start)/2;

        if(arr[mid] == Target){
            System.out.println(mid);
            break;
        }
        
        if (isAcs) {
            if(arr[mid] > Target ){
                end = mid -1; 
            }else{
                start =  mid+1;
            }
        }else{
            if(arr[mid] > Target ){
                start =  mid+1;
            }else{
                end = mid -1;
            }
        }
    }

    char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
    
    System.out.println(ceilingOfNumber(arr, 0));
    System.out.println(floorOfNumber(arr, 0));
    // System.out.println("a" == "b");
    System.out.println(nextGreatestLetter(letters, 'e'));

    }


    //ceilng of a number

    private static int ceilingOfNumber(int[] arr, int Target){

        if(Target > arr[arr.length-1]){
            return -1;
        }
        int start = 0; int end = arr.length-1;

        int mid; boolean isAsc = arr[0] < arr[arr.length-1];

        while(start<=end){
            mid = start + (end-start)/2;

            if(arr[mid] == Target){
                return arr[mid];
            }

            if(isAsc){
                if (arr[mid] < Target) {
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(arr[mid]<Target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return arr[start];
    }

    private static int floorOfNumber(int[] arr, int Target){

        if(Target < arr[0]){
            return -1;
        }
        int start = 0; int end = arr.length-1;

        int mid; boolean isAsc = arr[0] < arr[arr.length-1];

        while(start<=end){
            mid = start + (end-start)/2;

            if(arr[mid] == Target){
                return arr[mid];
            }

            if(isAsc){
                if (arr[mid] < Target) {
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(arr[mid]<Target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return arr[end];
    }

//leetcode 744. Find Smallest Letter Greater Than Target

private static char nextGreatestLetter(char[] letters, char target){
    if (letters[letters.length - 1] < target || target == letters[letters.length - 1]) {
        return letters[0];
    }

    int start = 0;
    int end = letters.length - 1;
    int mid = 0;

    while (start <= end) {

        mid = start + (end - start) / 2;

        if (target == letters[mid]) {
            if (letters[mid + 1] == target && mid + 1 <= end) {
                start = mid + 1;
            } else {
                return letters[mid + 1];
            }
        } else if (letters[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    return letters[start];
}

}
