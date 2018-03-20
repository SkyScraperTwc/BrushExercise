package indi.twc.algorithm.offer.No41to50;


/**
 * 构建乘积数组
 */
public class Main50 {
    public static void main(String[] args) {

    }

    public int[] multiply(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        for (int i = 0, product = 1; i < n; product *= A[i], i++) {
            B[i] = product;
        }
        for (int i = n - 1, product = 1; i >= 0; product *= A[i], i--) {
            B[i] *= product;
        }
        return B;
    }
}
