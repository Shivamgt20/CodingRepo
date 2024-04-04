package com.shivam;

public class SplitArrayLargestSum410 {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int k = 2;
        System.out.println(arraySum(nums, k));

    }

    private static int arraySum(int[] nums, int m) {
        int start = 0;
        int end = 0;
        int peice = 1;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        // System.out.println(start + "    " + end);

        while (start < end) {
            int sum = 0;
            peice = 1;
            int mid = start + (end - start) / 2;

            for (int num : nums) {
                if (sum + num <= mid) {
                    sum += num;
                } else {
                    sum = num;
                    peice++;
                }
            }

            if (peice > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        // while (start < end) {
        //     // try for the middle as potential ans
        //     int mid = start + (end - start) / 2;

        //     // calculate how many pieces you can divide this in with this max sum
        //     int sum = 0;
        //     int pieces = 1;
        //     for (int num : nums) {
        //         if (sum + num > mid) {
        //             // you cannot add this in this subarray, make new one
        //             // say you add this num in new subarray, then sum = num
        //             sum = num;
        //             pieces++;
        //         } else {
        //             sum += num;
        //         }
        //     }

        //     if (pieces > m) {
        //         start = mid + 1;
        //     } else {
        //         end = mid;
        //     }
        // }
        return end;
    }
}
