package indi.twc.algorithm.offer.No41to50;


/**
 * 数组中重复的数字
 */
public class Main49 {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,1,0,2,5,3};
        int[] duplication = new int[1];
        System.out.println(duplicate(array, array.length, duplication));
        System.out.println(duplication[0]);
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || numbers.length == 0) {
            duplication[0] = -1;
            return false;
        }
        int[] array = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            if (array[numbers[i]] == 0) {
                array[numbers[i]] = 1;
            } else {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
