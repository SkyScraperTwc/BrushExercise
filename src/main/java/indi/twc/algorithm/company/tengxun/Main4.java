package indi.twc.algorithm.company.tengxun;

import java.util.*;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] array = new int[s.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(s[i]);
            }
            System.out.println(MoreThanHalfNum_Solution(array));
        }
    }

    public static int MoreThanHalfNum_Solution(int[] gifts) {
        int majority = gifts[0];
        for (int i = 1, cnt = 1; i < gifts.length; i++) {
            cnt = gifts[i] == majority ? cnt + 1 : cnt - 1;
            if (cnt == 0) {
                majority = gifts[i];
                cnt = 1;
            }
        }
        int cnt = 0;
        for (int val : gifts) if (val == majority) cnt++;
        return cnt > gifts.length / 2 ? majority : 0;
    }

}