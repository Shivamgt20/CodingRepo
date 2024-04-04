package com.shivam;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        // int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1; // for 1 - N range if range is 0-N then int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
