package indi.twc.algorithm.offer.No31to40;


import java.util.Arrays;

/**
 * 数字在排序数组中出现的次数
 */
public class Main36 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,3,3,3,3,5,6};
        int result = GetNumberOfK(array, 3);
        System.out.println(result);
    }

    public static int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int firstIndex = getFirstIndex(array, k, 0, array.length - 1);
        int lastIndex = getLastIndex(array, k, 0, array.length - 1);

        if (firstIndex == -1 || lastIndex == -1) {
            return 0;
        }
        return lastIndex - firstIndex + 1;
    }

    private static int getLastIndex(int[] array, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (array[middle] == k) {
            if ((middle < end && array[middle + 1] != k) || middle == end) {
                return middle;
            } else {
                start = middle + 1;
            }
        } else if (array[middle] > k) {
            end = middle - 1;
        } else {
            start = middle + 1;
        }
        return getLastIndex(array, k, start, end);
    }

    private static int getFirstIndex(int[] array, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (array[middle] == k) {
            if ((middle > 0 && array[middle - 1] != k) || middle == 0) {
                return middle;
            } else {
                end = middle - 1;
            }
        } else if (array[middle] > k){
            end = middle - 1;
        } else {
            start = middle + 1;
        }
        return getFirstIndex(array, k, start, end);
    }

}
