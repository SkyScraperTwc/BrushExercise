package indi.twc.algorithm.offer.No31to40;


import java.util.ArrayList;

/**
 * 和为S的连续正数序列
 */
public class Main40 {
    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(100));
    }

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int start = 1;
        int end = 2;
        int mid = sum / 2;
        int ret = start + end;
        while (start <= mid && end < sum) {
            if (ret < sum) {
                end++;
                ret = ret + end;
            } else if (ret > sum){
                ret = ret - start;
                start++;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    list.add(i);
                }
                lists.add(list);
                ret = ret - start;
                start++;
                end++;
                ret = ret + end;
            }
        }
        return lists;
    }
}
