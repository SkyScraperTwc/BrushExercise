package indi.twc.algorithm.offer.No31to40;


import java.util.Arrays;

/**
 * 丑数
 */
public class Main32 {
    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(1500));
    }

    public static int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        int number = 0;
        int uglyNum = 0;
        while (uglyNum < index) {
            number++;
            if (isUgly(number)) {
                uglyNum++;
            }
        }
        return number;
    }

    private static boolean isUgly(int number) {

        while (number % 2 == 0) {
            number = number / 2;
        }
        while (number % 3 == 0) {
            number = number / 3;
        }
        while (number % 5 == 0) {
            number = number / 5;
        }

        if (number == 1) {
            return true;
        } else {
            return false;
        }
    }
}
