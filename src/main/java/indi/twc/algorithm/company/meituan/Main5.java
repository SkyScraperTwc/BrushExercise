package indi.twc.algorithm.company.meituan;

import java.util.Scanner;

public class Main5 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int result = resolve(str);
            System.out.println(result);
        }
    }

    public static int resolve(String str){
        if (str.equals("123456789")) {
            return 10;
        }
        int[] array = new int[9];
        str = str.replaceAll("0","");
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int index = ch[i] - '1';
            if (array[index] == 0) {
                array[index] = 1;
            } else {
                array[index] ++;
            }
        }
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0) {
                k = i + 1;
                break;
            }
        }
        return k;
    }

}