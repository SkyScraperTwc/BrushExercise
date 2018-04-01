package indi.twc.algorithm.company.xiechen;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[][] array = new int[N][3];
            for (int i = 0; i < N; i++) {
                String str = sc.nextLine();
                String[] strs = str.split(" ");
                array[i][0] = Integer.parseInt(strs[0]);
                array[i][1] = Integer.parseInt(strs[1]);
                array[i][2] = Integer.parseInt(strs[2]);
            }

            String[] info = sc.nextLine().split(" ");
            int[] infos = new int[info.length];
            for (int i = 0; i < infos.length; i++) {
                infos[i] = Integer.parseInt(info[i]);
            }
            resolve(array, infos);
        }
    }

    public static void resolve(int[][] array, int[] infos) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            if (array[i][0] >= infos[0] && array[i][1] >= infos[1] ) {
                sum = infos[2] * array[i][2];
                map.put(i, sum);
            }
        }

        List<Integer> list = (List<Integer>) map.values();
        Collections.sort(list);
        int min = list.get(0);
        int k;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == min) {
                k = entry.getKey();
            }
        }

    }

}