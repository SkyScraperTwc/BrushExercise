package indi.twc.algorithm.offer.No11to20;


import indi.twc.algorithm.offer.common.ListNode;

/**
 * 链表中倒数第k个结点
 */
public class Main14 {
    public static void main(String[] args) {

    }

    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
