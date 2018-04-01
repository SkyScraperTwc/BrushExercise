package indi.twc.algorithm.sort.improve;

import indi.twc.algorithm.utils.AlgorithmUtils;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {2,6,13,8,4,1,9,15,3,10,11,12,7,5,14,16};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int a[], int low, int high) {
        if(low < high){
            int index = partition(a,low,high);
            quickSort(a,low,index-1);
            quickSort(a,index+1,high);
        }

    }

    public static int partition(int a[], int low, int high){
        int pivot = a[low];

        while(low < high){

            while(low < high && a[high] >= pivot) {
                high--;
            }
            AlgorithmUtils.swap(a,low,high);

            while(low < high && a[low] <= pivot) {
                low++;
            }
            AlgorithmUtils.swap(a,low,high);
        }

        return low;
    }
}
