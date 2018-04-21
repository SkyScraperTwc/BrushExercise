package indi.twc.algorithm.company.weizhon;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long N = sc.nextLong();
            System.out.println(compute(N));
        }
    }

    public static int compute(long N){
        if (N <= 0) {
            return 0;
        }
        if (N <= 1) {
            return 2;
        }
        if (N <= 3) {
            return 3;
        }
        int sum = 3;

        int length = 1;
        int k = 1;
        while (k*2 < N) {
            k = k*2;
            length++;
        }

        for (int i = 3; i <= length; i++) {
            if (i < length) {
                int x = 0;
                if (i%2 == 1) {
                    x = (int) Math.pow(2,(i+1)/2-1);
                }
                if (i%2 == 0) {
                    x = (int) Math.pow(2, i/2-1);
                }
                sum = sum + x;
            } else {
                long num = (long) Math.pow(2,length);
                sum = sum + last(num, N);
            }

        }
        return sum;
    }
    public static int last(long num, long N){
        int sum = 0;
        for (long i = num; i <= N; i++) {
            if (judge(i)) {
                sum++;
            }
        }
        return sum;
    }

    public static boolean judge(long num) {
        String str = Long.toBinaryString(num);
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
