package indi.twc.algorithm.company.huawei.practiceD;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 大数相乘
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            String str = scan.nextLine();
            String[] s = str.split(" ");
            BigDecimal decimal1 = new BigDecimal(s[0]);
            BigDecimal decimal2 = new BigDecimal(s[1]);
            System.out.println(decimal1.multiply(decimal2));
        }
    }
}
