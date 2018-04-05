package indi.twc.algorithm.company.tengxun;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(compute(str));
        }
    }

    public static String compute (String str) {
        if (str == null && str.isEmpty()) {
            return "";
        }
        char[] ch = str.toCharArray();
        ArrayList<Character> lowList = new ArrayList<>();
        ArrayList<Character> highList = new ArrayList<>();

        for (int i = 0; i < ch.length; i++) {
            if ('A' <= ch[i] && ch[i] <= 'Z') {
                highList.add(ch[i]);
            } else {
                lowList.add(ch[i]);
            }
        }

        for (int i = 0; i < highList.size(); i++) {
            lowList.add(highList.get(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lowList.size(); i++) {
            sb.append(lowList.get(i));
        }
        return sb.toString();
    }
}