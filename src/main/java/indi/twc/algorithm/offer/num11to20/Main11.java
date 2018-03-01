package indi.twc.algorithm.offer.num11to20;

/**
 * 二进制中 1 的个数
 */
public class Main11 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(9));
    }

    public static int NumberOf1(int n) {
        int num = 0;
        while (n!=0) {
            n = n & (n-1);
            num++;
        }
        return num;
    }
}
