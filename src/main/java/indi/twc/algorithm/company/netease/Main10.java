package indi.twc.algorithm.company.netease;

import java.util.Scanner;

/**
 * 相反数
 */
public class Main10 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            long input = scan.nextLong();
            getResult(input);
        }
    }

    public static void getResult(long input){
        String str = String.valueOf(input);
        char[] chs = str.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = chs.length - 1; i >= 0; i--) {
            sb.append(chs[i]);
        }
        long num = Integer.valueOf(sb.toString().trim()) + input;
        System.out.println(num);
    }
}
