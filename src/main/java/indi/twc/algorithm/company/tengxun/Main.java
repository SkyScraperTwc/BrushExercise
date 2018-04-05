package indi.twc.algorithm.company.tengxun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(str.length() - compute(str));
        }
    }

    public static int compute (String str) {
        StringBuilder sb = new StringBuilder(str);
        String newStr = sb.reverse().toString();
        char[] c1 = str.toCharArray();
        char[] c2 = newStr.toCharArray();
        int len = c1.length + 1;
        int[][] dp = new int[len][len];
        for (int i = 1; i <= c1.length; i++) {
            for (int j = 1; j <= c2.length; j++) {
                if (c1[i-1] == c2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[c1.length][c1.length];
    }
}