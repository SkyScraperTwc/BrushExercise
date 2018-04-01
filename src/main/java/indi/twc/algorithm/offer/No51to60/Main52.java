package indi.twc.algorithm.offer.No51to60;


/**
 * 表示数值的字符串
 */
public class Main52 {
    public static void main(String[] args) {

    }

    public boolean isNumeric(char[] str) {
        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
}
