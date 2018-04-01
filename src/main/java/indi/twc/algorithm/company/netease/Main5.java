package indi.twc.algorithm.company.netease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int[] Dis = new int[N+1];
            int[] Pis = new int[N+1];
            for (int i = 0; i < N+1 ; i++) {
                int Di = scan.nextInt();
                int Pi = scan.nextInt();
                Dis[i] = Di;
                Pis[i] = Pi;
            }
            String AiString = scan.nextLine();
            String[] AisStr = AiString.split(" ");
            int[] Ais = new int[M];
            for (int i = 0; i < Ais.length; i++) {
                Ais[i] = Integer.valueOf(AisStr[i]);
            }
            resolve(N, M, Dis, Pis, Ais);
        }
    }

    public static void resolve(int N, int M, int[] Dis, int[] Pis, int[] Ais) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < Ais.length; i++) {
            for (int j = 0; j < Dis.length - 1; j++) {
                if (Ais[i] >= Dis[j] && Ais[i] < Dis[j+1]) {
                    list.add(Pis[j]);
                    break;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}