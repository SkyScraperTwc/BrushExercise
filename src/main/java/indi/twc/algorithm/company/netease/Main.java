package indi.twc.algorithm.company.netease;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int result = compute(str);
            System.out.println(result);
        }
    }

    public static int compute (String str) {
        String[] s = str.split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int z = Integer.parseInt(s[2]);
        int start = Integer.parseInt(s[3]);
        int end = Integer.parseInt(s[4]);
        int num = 0;
        while (start < end) {
            if (start * 2 < end) {
                start = start * 2;
                num = num + y;
            } else {
                while (start != end) {
                    start = start + 2;
                    num = num + x;
                }
            }
        }
        return num;
    }
}