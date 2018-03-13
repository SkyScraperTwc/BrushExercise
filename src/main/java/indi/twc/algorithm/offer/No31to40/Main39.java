package indi.twc.algorithm.offer.No31to40;


/**
 * 数组中只出现一次的数字
 */
public class Main39 {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,2,2,3,3,4,4,5,5,6,7};
        FindNumsAppearOnce(array, new int[1], new int[1]);
    }

    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null || array.length == 0) {
            return;
        }

        num1[0] = 0;
        num2[0] = 0;
        int pivot = 0;
        for (int i = 0; i < array.length - 1; i++) {
            pivot = array[i] ^ array[i + 1];
        }

        int firstBitIndex = findFirstBitis1(pivot);
        for (int i = 0; i < array.length; i++) {
            if (isBit1(array[i], firstBitIndex)) {
                num1[0] = num1[0] ^ array[i];
            } else {
                num2[0] = num2[0] ^ array[i];
            }
        }
        System.out.println(num1[0]);
        System.out.println(num2[0]);

    }
    public static int findFirstBitis1(int num) {
        int index = 0;
        while ((num & 1) == 0) {
            index++;
            num = num >> 1;
        }
        return index;
    }

    public static boolean isBit1(int num, int index) {
        num = num >> index;
        if ((num & 1) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
