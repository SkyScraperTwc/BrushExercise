package indi.twc.algorithm.company.meituan;

import java.util.*;

/**
 * 大富翁游戏
 */
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(resolve(n));
        }
    }

    private static int resolve(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        return 2 * resolve(n-1);
    }
}