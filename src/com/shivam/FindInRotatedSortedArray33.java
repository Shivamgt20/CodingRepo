package com.shivam;

public class FindInRotatedSortedArray33 {
    public static void main(String[] args) {

        int[] nums = { 2, 2, 2, 5, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        int target = 5;

        // int peak = peak(nums);
        int peak = peakwithDuplicate(nums);

        if (peak == -1) {
            System.out.println(Binarysearch(0, nums.length - 1, nums, target));
        } else if (target == nums[peak]) {
            System.out.println(peak);
        } else if (target < nums[peak] && target <= nums[nums.length - 1]) {
            // peak to right
            System.out.println(Binarysearch(peak + 1, nums.length - 1, nums, target));
        } else {
            // 0 to peak
            System.out.println(Binarysearch(0, peak - 1, nums, target));
        }
    }

    private static int Binarysearch(int start, int end, int[] nums, int target) {

        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int peak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] < nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int peakwithDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            // 1. condition
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // 2. condition
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // 3. is start = mid = end
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                if ( nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (mid > start
                    && (nums[start] < nums[mid] || (nums[mid] == nums[start] && nums[mid] > nums[end]))) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
