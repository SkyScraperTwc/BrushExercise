package indi.twc.algorithm.offer.No21to30;


/**
 *
 */
public class Main29 {
    public static void main(String[] args) {
        int[] input = new int[]{6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(input));
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        int ret = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (sum <= 0) {
                sum = array[i];
            } else {
                sum = sum + array[i];
            }
            ret = Math.max(sum, ret);
        }
        return ret;
    }
}
