package indi.twc.algorithm.offer.No41to50;

/**
 * 把字符串转换成整数
 */
public class Main48 {
    public static void main(String[] args) {
        System.out.println(StrToInt("2147483647"));
    }

    public static int StrToInt(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        char[] chs =  str.toCharArray();
        int num = 0;
        int flag = 1;
        for (int i = 0; i < chs.length; i++) {
            if (i == 0) {
                if (chs[i] == '-') {
                    flag = -1;
                    continue;
                } else if (chs[i] == '+') {
                    flag = 1;
                    continue;
                }
            }
            if (chs[i] >= '0' && chs[i] <= '9') {
                int n = chs[i] - '0';
                num = num * 10 + n;
            } else {
                return 0;
            }
        }
        num = num * flag;
        return num;
    }
}
