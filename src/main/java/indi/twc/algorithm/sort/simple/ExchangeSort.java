package indi.twc.algorithm.sort.simple;

import indi.twc.algorithm.utils.AlgorithmUtils;

import java.util.Arrays;
/**
 *	非正式冒泡排序
 *  最简单的交换排序
 */
public class ExchangeSort {
    public static void main(String[] args) {
        int arr[] = {2,6,13,8,4,1,9,15,3,10,11,12,7,5,14,16};
        exchangeSort(arr);
    }

    public static void exchangeSort(int a[]){
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]){
                    AlgorithmUtils.swap(a,i,j);
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
