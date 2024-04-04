package com.shivam;
import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        // int n = in.nextInt();
        int[] arr1 = {1,2,3,3};
        int[] arr2 = {2,2,4};

        System.out.println(FindUnion(arr1, arr2));
        
    }

    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2){
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=0; int j=0; 

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                if(list.size() == 0 || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                    i++; j++;
                }
            }else if(arr1[i]<arr2[j]){
                if(list.size() == 0 || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                    i++;
                }
            }else{
                if(list.size() == 0 || list.get(list.size()-1) != arr2[j]){
                    list.add(arr2[j]);
                    j++;
                }
            }   
        }

        while (i<arr1.length){
            if(list.size() == 0 || list.get(list.size()-1) != arr1[i]){
                list.add(arr1[i]);
                i++;
            }
        }

        while (j<arr2.length) {
            if(list.size() == 0 || list.get(list.size()-1) != arr2[j]){
                list.add(arr2[j]);
                j++;
            }
        }

        return list;
    }


}