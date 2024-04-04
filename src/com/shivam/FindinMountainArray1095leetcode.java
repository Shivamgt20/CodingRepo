package com.shivam;

public class FindinMountainArray1095leetcode {
        public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};

        int target = 3;
        int end = arr.length - 1;
        int peak = peakIndex(arr, 0, end);

        // Binary search in left
        int left = binarysearch(arr, 0, peak, target);

        // Binary search in right
        int right = binarysearch(arr, peak + 1, end, target);

        System.out.println(Math.max(left, right));

    }

    private static int peakIndex(int[] arr, int start, int end) {

        while (start != end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                end = mid + 1;
            } else {
                start = mid;
            }
        }
        return start;
    }

    private static int binarysearch(int[] arr, int start, int end, int target) {

        while (start <= end) {
            final int mid = start + (end - start) / 2;

            Boolean isAsc = arr[start] < arr[end];

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    
}
