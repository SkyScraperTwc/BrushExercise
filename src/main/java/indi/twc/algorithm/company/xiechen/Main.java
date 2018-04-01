package indi.twc.algorithm.company.xiechen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(resolve(array)));
        }
    }

    public static int[] resolve (int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        int numberOfZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                list.add(array[i]);
            } else {
                numberOfZero++;
            }
        }

        int k = 0;
        for (Integer integer : list) {
            array[k] = integer;
            k++;
        }
        while (numberOfZero > 0) {
            array[k] = 0;
            k++;
            numberOfZero--;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
}