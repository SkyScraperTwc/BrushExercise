package indi.twc.algorithm.company.tengxun;

import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = Long.valueOf(scanner.nextLine());
        String[] list =  scanner.nextLine().split(" ");
        long A = Long.valueOf(list[0]);
        long x = Long.valueOf(list[1]);
        long B = Long.valueOf(list[2]);
        long y = Long.valueOf(list[3]);
        System.out.println(resolve(k,A,x,B,y)%1000000007);
    }

    private static long resolve(long k, long A, long x, long B, long y) {
        long result = 0;

        long now = 0;
        long i = 0;
        while (i <= x && now <= k) {
            if ((k - now) % B == 0) {
                long c1 = getC(i, x) == 0 ? 1 : getC(i, x);
                long c2 = getC((k - now) / B, B);
                result += c1 * c2;
            }
            now += A;
            i++;
        }
        return result;
    }

    private static long getC(long i, long I) {
        long a1 = 1;
        long a2 = 1;
        for (long x = 1, y = I; x <= i; x++, y--) {
            a1 *= y;
            a2 *= x;
        }
        return a1 / a2;
    }


}