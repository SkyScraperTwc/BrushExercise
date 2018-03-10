package indi.twc.algorithm.company.cvte;

import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        String result = resolve("ggghhggghhggg");
        System.out.println(result);
    }

    public static String resolve(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        if (s.length() == 1) {
            return s;
        }

        String str = s.toLowerCase();
        char[] ch = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        stack.push(ch[0]);
        StringBuilder builder = new StringBuilder("");

        char c = ch[0];
        int num = 1;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == c) {
                num++;
            } else {
                if (num > 1) {
                    builder.append(c).append(num);
                } else {
                    builder.append(c);
                }
                c = ch[i];
                num = 1;
            }
        }

        builder.append(c).append(num);

        return builder.toString();
    }
}
