package indi.twc.algorithm.offer.No41to50;


import java.util.Objects;

/**
 * 翻转单词顺序列
 */
public class Main43 {
    public static void main(String[] args) {
        String str = "student. a am I";
        System.out.println(ReverseSentence(" "));
    }

    public static String ReverseSentence(String str) {
        if (Objects.equals(str, " ")) {
            return " ";
        }
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] s = str.split(" ");
        StringBuilder builder = new StringBuilder("");
        for (int i = s.length - 1; i>=0; i-- ) {
            builder.append(s[i]).append(" ");
        }
        String result = builder.toString();
        return result.substring(0, result.length() - 1);
    }
}
