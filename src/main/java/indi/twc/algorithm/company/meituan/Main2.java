package indi.twc.algorithm.company.meituan;

import java.util.Scanner;

/**
 * 拼凑钱币
 */
public class Main2 {
    public static long count(int n){
        if(n <= 0)return 0;
        int[] coins = new int[]{1,5,10,20,50,100};
        long[] dp = new long[n+1];
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++) {
            for(int j = coins[i]; j <= n; j++) {
                dp[j] = dp[j] + dp[j - coins[i]];//类似斐波那契 后者的种类数基于前者
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            long res=count(n);
            System.out.println(res);
        }
    }
}