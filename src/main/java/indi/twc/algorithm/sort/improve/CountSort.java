package indi.twc.algorithm.sort.improve;


import java.util.Arrays;

/**
 * 计数排序
 */
public class CountSort {
    public static void main(String[] args) {
        int arr[] = {2,6,8,4,1,9,15,3,10,11,12,7,5,1,5,6};
        countSort(arr);
    }


    public static void countSort(int array[]){
        if (array == null || array.length == 0) {
            return ;
        }
        int max = max(array);
        int[] count = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[k] = i;
                k++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
