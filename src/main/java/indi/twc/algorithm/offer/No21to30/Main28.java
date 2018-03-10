package indi.twc.algorithm.offer.No21to30;


import java.util.*;

/**
 * 最小的K个数
 */
public class Main28 {
    public static void main(String[] args) {
        int[] input = new int[]{4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(input, 4));

    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (k > input.length || k == 0) {
            return new ArrayList<>();
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < input.length; i++) {
            if (set.size() == k) {
                int bigestNum = set.last();
                if (bigestNum > input[i]) {
                    set.remove(bigestNum);
                    set.add(input[i]);
                }
            } else {
                set.add(input[i]);
            }

        }
        return new ArrayList<>(set);
    }
}
