package indi.twc.algorithm.offer.No11to20;

import java.util.Arrays;

/**
 * 调整数组顺序使奇数位于偶数前面,并且相对位置不变
 */
public class Main12 {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,6,8,1,3,5,7};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reOrderArray(int [] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int[] orderArray = array.clone();

        int oddNum = 0;
        for (int i=0; i<orderArray.length; i++) {
            if (orderArray[i] % 2 != 0) {
                oddNum++;
            }
        }

        int j = 0;
        for (int i=0; i<orderArray.length; i++) {
            if (orderArray[i] % 2 != 0) {
                array[j] = orderArray[i];
                j++;
            } else {
                array[oddNum] = orderArray[i];
                oddNum++;
            }
        }
    }
}
