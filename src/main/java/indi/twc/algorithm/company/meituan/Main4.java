package indi.twc.algorithm.company.meituan;

import java.util.*;

public class Main4 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int result = resolve(s1, s2);
            System.out.println(result);
        }
    }

    public static int resolve(String s1, String s2){
        if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int sum = 0;
        char[] ch2 = s2.toCharArray();
        for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
            String sub = s1.substring(i, i+s2.length());
            char[] ch1 = sub.toCharArray();
            int k = 0;
            for (int j = 0; j < ch1.length; j++) {
                if (ch1[j] != ch2[j]){
                    k++;
                }
            }
            sum = sum + k;
        }
        return sum;
    }

}