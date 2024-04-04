package com.shivam;

import java.util.ArrayList;

public class FindUnionOfArray {
    public static void main(String[] args) {

        // int[] arr1 = {1, 2, 3, 4, 6};
        int[] arr1 = {1,1,2,3,5,5,5,10,10 }; 
        // int[] arr2 = {2, 3, 5};
        int[] arr2 = {2,4,7,10,10};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=0; int j=0; int idx = 0;

        while(i<arr1.length && j<arr2.length){

            if(list.size()>0 && list.get(idx-1) == arr1[i]){
                i++;
            }else if(list.size()>0 && list.get(idx-1) == arr2[j]){
                j++;
            } else if(arr1[i] == arr2[j]){
                list.add(arr1[i]);
                i++; j++; idx++;
            }else if(arr1[i]<arr2[j]){
                list.add(arr1[i]);
                i++; idx++;
            }else{
                list.add(arr2[j]);
                j++; idx++;
            }
        }

        while(i<arr1.length){
            if(list.size()>0 && list.get(idx-1) != arr1[i]){
                list.add(arr1[i]); idx++;
            }
            i++; 
        }

        while(j<arr2.length){
            if(list.size()>0 && list.get(idx-1) != arr2[j]){
                list.add(arr2[j]); idx++;
            }
            j++;
        }

        System.out.println(list);
    }
}
