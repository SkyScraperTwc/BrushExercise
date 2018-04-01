package indi.twc.algorithm.sort.improve;

import java.util.*;

/**
 * 桶排序
 */
public class BucketSort {
    public static void main(String[] args) {
        int array[] = {2,6,8,4,1,9,15,3,10,11,12,7,5,1,5,6,85};
        bucketSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bucketSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int bucketNums = 10;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketNums; i++) {
            buckets.add(new LinkedList<>());
        }

        //划分桶
        for (int i = 0; i < array.length; i++) {
            buckets.get(fun(array[i])).add(array[i]);
        }

        for (int i = 0; i < buckets.size(); i++) {
            if (!buckets.get(i).isEmpty()) {
                Collections.sort(buckets.get(i));
            }
        }

        int k = 0;
        for (int i = 0; i < buckets.size(); i++) {
            for (int j = 0; j < buckets.get(i).size(); j++) {
                array[k++] = buckets.get(i).get(j);
            }
        }
    }

    public static int fun(int x) {
        return x / 10;
    }
}
