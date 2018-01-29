package indi.twc.algorithm.huawei.practiceD;

import java.util.Scanner;

/**
 * 进制转换
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            String value = scan.nextLine();
            String hex = value.replaceAll("0x","");
            System.out.println(Integer.parseInt(hex,16));
        }
    }
}
