package indi.twc.algorithm.offer.num1to10;


/**
 * 旋转数组的最小数字
 */
public class Main6 {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) {
            return 0;
        }

        int left = 0;
        int right = array.length - 1;

        int mid = -1;
        while (array[left] >= array[right]) {
            if (right - left == 1){
                return array[right];
            }

            mid = left + (right - left) / 2;
            if (array[mid] >= array[left]) {
                left = mid;
            } else if (array[mid] <= array[right]) {
                right = mid;
            }
        }
        return array[mid];
    }
}
