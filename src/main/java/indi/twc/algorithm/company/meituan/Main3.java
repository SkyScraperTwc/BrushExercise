package indi.twc.algorithm.company.meituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 最大矩形面积
 */
public class Main3 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(sc.next());
            }
            System.out.println(Arrays.toString(array));
            System.out.println(resolve(array));
        }
    }

    public static int resolve(int[] array){
        int minHeight;
        int area = 0;
        for (int i = 0; i < array.length; i++) {
            minHeight = array[i];
            for (int j = i; j < array.length; j++) {
                minHeight = Math.min(minHeight, array[j]);
                area = Math.max(area, minHeight * (j - i + 1));
            }
        }
        return area;
    }
}