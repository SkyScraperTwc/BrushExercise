package indi.twc.algorithm.sort.simple;

import indi.twc.algorithm.utils.AlgorithmUtils;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,6,13,8,4,1,9,15,3,10,11,12,7,5,14,16};
        bulbleSort(arr);
    }

    public static void bulbleSort(int a[]){
        for (int i = 0; i <a.length ; i++) {
            for (int j = a.length-1; j>i ; j--) {
                if (a[j] < a[j-1]){
                    AlgorithmUtils.swap(a,j,j-1);
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
