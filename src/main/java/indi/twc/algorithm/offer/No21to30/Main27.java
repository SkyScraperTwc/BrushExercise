package indi.twc.algorithm.offer.No21to30;


import java.util.HashMap;
import java.util.Map;

/**
 * 数组中出现次数超过一半的数字
 */
public class Main27 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution2(array));
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        int result = array[0];
        int times = 1;
        for (int i = 1; i < array.length; i++) {
            if (times == 0) {
                result = array[i];
                times = 1;
            } else if (array[i] == result){
                times++;
            } else {
                times--;
            }
        }

        times = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == result) {
                times++;
            }
        }

        if (times > array.length / 2) {
            return result;
        } else {
            return 0;
        }

    }

    public static int MoreThanHalfNum_Solution2(int [] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer times = map.get(array[i]);
            if (times != null) {
                map.put(array[i], times + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        int value = -1;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (value < entry.getValue()) {
                key = entry.getKey();
                value = entry.getValue();
            }
        }

        if (value > array.length / 2) {
            return key;
        } else {
            return 0;
        }
    }
}
