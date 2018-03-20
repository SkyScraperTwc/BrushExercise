package indi.twc.algorithm.offer.No41to50;


/**
 * 求1+2+3+...+n
 */
public class Main46 {
    public static void main(String[] args) {
        System.out.println(Sum_Solution(100));
    }

    public static int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (n > 0) && ((sum = sum + Sum_Solution(n - 1)) > 0);
        return sum;
    }
}
