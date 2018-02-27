package indi.twc.algorithm.sort.simple;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int arr[] = {2,6,13,8,4,1,9,15,3,10,11,12,7,5,14,16};
        insertSort(arr);
    }

    public static void insertSort(int a[]) {
        int temp,j;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            for (j = i; j>0 && temp<a[j-1]; j--) {
                a[j] = a[j-1];
            }
            a[j] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
