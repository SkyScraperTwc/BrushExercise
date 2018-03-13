package indi.twc.algorithm.offer.No21to30;


/**
 * 整数中1出现的次数（从1到n整数中1出现的次数）
 */
public class Main30 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(12));
    }

    public static int NumberOf1Between1AndN_Solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + numberOf1(i);
        }
        return sum;
    }

    public static int numberOf1(int num) {
        int sum = 0;
        while (num != 0) {
            if (num % 10 == 1) {
                sum++;
            }
            num = num / 10;
        }
        return sum;
    }
}
