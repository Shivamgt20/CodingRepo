package com.shivam;

public class RotateString796 {
    public static void main(String[] args) {
        // System.out.println(rotateString("abcde", "cdeab"));

        // System.out.println(isIsomorphic("foo","bar"));

        // System.out.println(isPerfectSquare(808201));

        System.out.println(myAtoi("9223372036854775808"));



    }

    public static boolean rotateString(String s, String goal) {

        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(s.length() - 1 - i) + s.substring(0, s.length() - 1 - i);

            if (temp.equals(goal))
                return true;
        }

        return false;
    }

    public static boolean isIsomorphic(String s, String t) {
        char[] st_mapping = new char[26]; // s to t
        char[] ts_mapping = new char[26]; // t to s

        for (int i = 0; i < s.length(); i++) {
            if (ts_mapping[t.charAt(i) - 'a'] == '\u0000' && st_mapping[s.charAt(i) - 'a'] == '\u0000') {
                ts_mapping[t.charAt(i) - 'a'] = s.charAt(i);
                st_mapping[s.charAt(i) - 'a'] = t.charAt(i);
            } else if (ts_mapping[t.charAt(i) - 'a'] != s.charAt(i) || st_mapping[s.charAt(i) - 'a'] != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectSquare(int num) {
        long start = 0, end = num / 2 + 1;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            }

            if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }


    public static int myAtoi(String s) {
        s = s.strip();

        if (s.isEmpty())
            return 0;

        int sign = s.charAt(0) == '-' ? -1 : 1;
        if (s.charAt(0) == '+' || s.charAt(0) == '-')
            s = s.substring(1);

        long ans = 0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch - '0' >= 0 && ch - '0' <= 9) {
                ans = ans * 10 + (ch - '0');
                if (sign * ans > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (sign * ans < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }

        return sign * (int) (ans);
    }


}
