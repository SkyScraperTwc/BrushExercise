package indi.twc.algorithm.offer.No41to50;


import java.util.LinkedList;

/**
 * 孩子们的游戏(圆圈中最后剩下的数)
 */
public class Main45 {
    public static void main(String[] args) {
        System.out.println(lastRemaining(5, 3));
    }

    public static int lastRemaining(int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1) {
            index = (index + m - 1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }
}
