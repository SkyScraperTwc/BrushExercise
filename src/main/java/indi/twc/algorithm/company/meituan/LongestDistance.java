package indi.twc.algorithm.company.meituan;

/**
 * 最大差值
 */
public class LongestDistance {
    public static void main(String[] args) {
        int[] A = new int[]{3,6,7,9,2,1,8};
        System.out.println(getDis(A, 2));
    }

    public static int getDis(int[] A, int n) {
        if (A == null || A.length == 0 ) {
            return 0;
        }

        int ret = 0;
        for (int i = A.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if (A[i] - A[j] > ret) {
                    ret = A[i] - A[j];
                }
            }
        }
        return ret;
    }
}
