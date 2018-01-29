package indi.twc.algorithm.utils;

public class AlgorithmUtils {
    /**
     * 交换数组两个数
     */
    public static void swap(int a[], int k, int m){
        int temp;
        temp = a[k];
        a[k] = a[m];
        a[m] = temp;
    }
}
