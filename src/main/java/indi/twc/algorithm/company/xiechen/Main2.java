package indi.twc.algorithm.company.xiechen;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String first = sc.nextLine();
            String[] strs = first.split(" ");
            int length = strs.length;
            int[][] array = new int[length][length];
            for (int i = 0; i < strs.length; i++) {
                array[0][i] = Integer.valueOf(strs[i]);
            }
            for (int i = 1; i < length; i++) {
                String other = sc.nextLine();
                String[] others = other.split(" ");
                for (int j = 0; j < length; j++) {
                    array[i][j] = Integer.valueOf(others[j]);
                }
            }
            resolve(array);
        }
    }

    public static void resolve(int[][] array) {
        int n = array.length;
        int[][] m = new int[n][n];
        for(int row = 0;row < n;row++){
            for(int col = 0;col < n;col++){
                m[row][col] = array[n-1-col][row];
            }
        }
        //再赋值回array，注意java是形参是引用传递
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                array[row][col] = m[row][col];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[i].length - 1) {
                    System.out.print(" ");
                }
            }
            if (i != array.length - 1) {
                System.out.println("");
            }
        }
    }

}