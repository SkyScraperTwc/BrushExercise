package indi.twc.algorithm.offer.No61to70;


import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 滑动窗口的最大值
 */
public class Main63 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (size > num.length || size < 1) return ret;
        // 构建最大堆，即堆顶元素是堆的最大值。
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < size; i++) heap.add(num[i]);
        ret.add(heap.peek());
        for (int i = 1; i + size - 1 < num.length; i++) {
            heap.remove(num[i - 1]);
            heap.add(num[i + size - 1]);
            ret.add(heap.peek());
        }
        return ret;
    }
}
