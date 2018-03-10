package indi.twc.algorithm.offer.No1to10;


/**
 * 斐波那契数列
 */
public class Main7 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static int Fibonacci2(int n) {
        int f0 = 0;
        int f1 = 1;

        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }

        int fn = 0;
        for (int i = 2; i <= n ; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
}
