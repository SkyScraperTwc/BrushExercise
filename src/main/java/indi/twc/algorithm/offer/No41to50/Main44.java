package indi.twc.algorithm.offer.No41to50;


import java.util.Arrays;

/**
 * 扑克牌顺子
 */
public class Main44 {
    public static void main(String[] args) {
        int[] numbers = new int[]{0,2,3,5,6};
        System.out.println(isContinuous(numbers));
    }

    public static boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }

        Arrays.sort(numbers);
        int numberOfZero = 0;
        int numberOfGap = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numberOfZero++;
            }
        }

        for (int i = numberOfZero; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return false;
            } else {
                numberOfGap = numberOfGap + numbers[i + 1] - numbers[i] - 1;
            }
        }

        if (numberOfZero >= numberOfGap) {
            return true;
        } else {
            return false;
        }
    }
}
