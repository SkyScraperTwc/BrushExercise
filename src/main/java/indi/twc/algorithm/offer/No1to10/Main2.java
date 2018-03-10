package indi.twc.algorithm.offer.No1to10;

/**
 * 替换空格
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
    }

    public static String replaceSpace(StringBuffer str) {
        char[] ch =  str.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
