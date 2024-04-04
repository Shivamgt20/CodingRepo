package com.shivam;

import java.util.ArrayList;
import java.util.List;

public class GreyCode89 {
    public static void main(String[] args) {
        int n =2;

        List<Integer> ans = new ArrayList<>();
    ans.add(0);

    for (int i = 0; i < n; ++i)
      for (int j = ans.size() - 1; j >= 0; --j)
        ans.add(ans.get(j) | 1 << i);

        // System.out.println(ans);

        int[] arr = {1,1,1}; 
        System.out.println(countTriplets(arr));
    }


    public static int countTriplets(int[] arr) {

        if (arr.length < 2)
            return 0;

        int lhs = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            lhs ^= arr[i];

            int rhs = 0;
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    rhs ^= arr[k];
                    if (lhs == rhs)
                        count++;
                }
            }
            lhs = 0;
        }
        return count;
    }
}
