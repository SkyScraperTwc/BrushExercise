package indi.twc.algorithm.offer.No41to50;


import java.util.ArrayList;

/**
 * 和为S的两个数字
 */
public class Main41 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,4,7,11,15};
        int sum = 15;
        System.out.println(FindNumbersWithSum(array, sum));
    }

    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int start = 0;
        int end = array.length - 1;
        int ret = Integer.MAX_VALUE;
        int small = 0;
        int big = 0;
        while (start < end) {
            int left = array[start];
            int right = array[end];
            int result = left + right;
            if (result == sum) {
                if (left * right < ret) {
                    small = left;
                    big = right;
                    ret = left * right;
                }
                start++;
                end--;
            } else if (result < sum) {
                start++;
            } else {
                end--;
            }
        }
        if (small > 0 && big > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(small);
            list.add(big);
            return list;
        } else {
            return new ArrayList<>();
        }

    }
}
