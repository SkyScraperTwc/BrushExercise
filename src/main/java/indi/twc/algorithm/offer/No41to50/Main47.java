package indi.twc.algorithm.offer.No41to50;


/**
 * 不用加减乘除做加法
 */
public class Main47 {
    public static void main(String[] args) {

    }

    public int Add(int num1, int num2) {
        if(num2 == 0) return num1;
        return Add(num1 ^ num2, (num1 & num2) << 1);
    }
}
