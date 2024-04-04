package com.shivam;
import java.util.Arrays;

public class FindAllNumberDisappeared448 {
    public static void main(String[] args) {
        int[] arr = { 3,1,3,4,2};

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));System.out.println();

        for(i = 0; i<arr.length; i++){
            if(arr[i]-1 != i) System.out.print(i +1 + " ");
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
