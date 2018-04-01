package indi.twc.algorithm.company.netease;

import java.util.Scanner;

/**
 * 字符串碎片
 */
public class Main2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String input = scan.nextLine();
            getResult(input);
        }
    }

    public static void getResult(String input){
        char[] chs = input.toCharArray();
        if (chs.length == 1) {
            System.out.println(1);
        }
        int i = 0;
        int sum = 0;
        int m = 0;
        while (i < chs.length) {
            int k = 1;
            while ((i + 1) < chs.length && chs[i] == chs[i + 1]) {
                k++;
                i++;
            }
            i = i + 1;
            m++;
            sum = sum + k;
        }
        double dou = (double) sum / m;
        String result = String.valueOf(dou) + "00";
        String[] s = result.split("\\.");
        result = s[0] + "." + s[1].substring(0, 2);
        System.out.println(result);
    }
}
