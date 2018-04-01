package indi.twc.algorithm.sort.improve;

import java.util.*;

/**
 * 基数排序
 */
public class RadixSort {
    public static void main(String[] args) {
        int array[] = {2,6,8,4,1,9,15,3,10,11,12,7,5,1,5,6,85};
        radixSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void radixSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int maxBit = getMaxBit(array);

        for (int i = 1; i <= maxBit ; i++) {
            List<List<Integer>> buf = distribute(array, i);
            collecte(array, buf);
        }
    }

    private static List<List<Integer>> distribute(int[] array, int iBit) {
        List<List<Integer>> buf = new ArrayList<>();

        for (int j = 0; j < 10; j++) {
            buf.add(new LinkedList<>());
        }

        for (int i = 0; i < array.length; i++) {
            buf.get(getNBit(array[i], iBit)).add(array[i]);
        }
        return buf;
    }

    private static void collecte(int[] array, List<List<Integer>> buf) {
        int k = 0;
        for (List<Integer> bucket : buf) {
            for (int ele : bucket) {
                array[k++] = ele;
            }
        }

    }

    private static int getMaxBit(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int ele : array) {
            int len = (ele + "").length();
            if (len > max) {
                max = len;
            }
        }
        return max;
    }

    public static int getNBit(int x, int n) {
        String strx = x + "";
        if (strx.length() < n) {
            return 0;
        } else {
            return strx.charAt(strx.length() - n) - '0';
        }

    }

}
