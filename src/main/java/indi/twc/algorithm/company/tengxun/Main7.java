package indi.twc.algorithm.company.tengxun;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(compute(n, m));
        }
    }

    public static int compute(int n, int m) {
        int sum = 0;
        int k = 0;
        int flag = -1;
        for (int i = 1; i <=n ; i++) {
            sum = sum + flag * i;
            k++;
            if (k == m) {
                k = 0;
                flag = -flag;
            }
        }
        return sum;
    }


}