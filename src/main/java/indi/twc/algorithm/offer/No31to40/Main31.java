package indi.twc.algorithm.offer.No31to40;


import java.util.Arrays;

/**
 * 把数组排成最小的数
 */
public class Main31 {
    public static void main(String[] args) {
        System.out.println(PrintMinNumber(new int[]{3, 32, 321}));
    }

    public static String PrintMinNumber(int [] numbers) {
        int n = numbers.length;
        String [] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = numbers[i] + "";
        }

        Arrays.sort(nums, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        String ret = "";
        for (String str : nums) {
            ret = ret + str;
        }
        return ret;
    }
}
