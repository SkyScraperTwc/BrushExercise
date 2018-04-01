package indi.twc.algorithm.company.netease;

import java.util.*;

public class Main4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            System.out.println(resolve(n, k));
        }
    }

    public static int resolve(int n, int k) {
//        Set<String> set = new HashSet<>();
        int num = 0;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
//                if (j - i )
                if (i % j >= k) {
//                    set.add(i+","+j);
                    num++;
                }
            }
        }
//        System.out.println(set);
        return num;
    }

}