package com.shivam;
import java.util.Arrays;
import java.util.ArrayList;

public class recurssionBasic {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,10,8,9,10, 10, 10, 6};
        // System.out.println(isSorted(arr, 0)); 

        // System.out.println(linearSearch(arr, 0, 10));

        // System.out.println(findAlloccurances(arr, 0, 10, new ArrayList<Integer>()));


    }


    // Is array sorted
    private static boolean isSorted(int[] arr, int i){

        if(i == arr.length-1) return true;

        return arr[i]<arr[i+1] && isSorted(arr, i+1);
    }

    
    //Linear search using recurrsion
    private static int linearSearch(int[] arr, int index, int target){

        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return linearSearch(arr, index+1, target);
    }


    //Find all index of element
    private static ArrayList findAlloccurances(int[] arr, int index, int target, ArrayList<Integer> list){


        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
    
        return findAlloccurances(arr, index+1, target, list);

    }




}
