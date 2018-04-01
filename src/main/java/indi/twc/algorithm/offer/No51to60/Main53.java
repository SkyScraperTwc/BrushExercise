package indi.twc.algorithm.offer.No51to60;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 字符流中第一个不重复的字符
 */
public class Main53 {
    public static void main(String[] args) {

    }

    private int[] cnts = new int[256];
    private Queue<Character> queue = new LinkedList<>();

    public void Insert(char ch) {
        cnts[ch]++;
        queue.add(ch);
        while (!queue.isEmpty() && cnts[queue.peek()] > 1) {
            queue.poll();
        }
    }

    public char FirstAppearingOnce() {
        if (queue.isEmpty()) return '#';
        return queue.peek();
    }
}
