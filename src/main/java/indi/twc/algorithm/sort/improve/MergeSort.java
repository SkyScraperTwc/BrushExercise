package indi.twc.algorithm.sort.improve;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int array[] = {2,6,8,4,1,9,15,3,10,11,12,7,5,1,5,6};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void mergeSort(int array[]){
        if (array == null || array.length == 0) {
            return ;
        }
        mSort(array, 0, array.length - 1);
    }

    public static void mSort(int array[], int left, int right){
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;

        mSort(array, left, mid);
        mSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }
    public static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            array[left + p] = temp[p];
        }
    }
}
