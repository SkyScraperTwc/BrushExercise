package indi.twc.algorithm.offer.No41to50;


/**
 * 左旋转字符串
 */
public class Main42 {
    public static void main(String[] args) {
        String S = "abcXYZdef";
        System.out.println(LeftRotateString(S, 3));
    }

    public static String LeftRotateString(String str,int n) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String sub1 = str.substring(0, n);
        String sub2 = str.substring(n, str.length());

        return sub2 + sub1;
    }
}
