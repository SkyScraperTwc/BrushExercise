package indi.twc.algorithm.offer.No51to60;


import indi.twc.algorithm.offer.common.ListNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 链表中环的入口结点
 */
public class Main54 {
    public static void main(String[] args) {

    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }

        if (pHead.next == null) {
            return null;
        }

        ListNode slow = null;
        ListNode fast = null;
        slow = pHead.next;
        if (slow != null) {
            fast = slow.next;
        }

        while (fast != slow) {
            slow = slow.next;
            fast = fast.next.next;
        }

//        int nodesInLoop = 1;
//        slow = slow.next;
//        while (fast != slow) {
//            slow = slow.next;
//            nodesInLoop++;
//        }

        ListNode pNode = pHead;
        while (pNode != slow) {
            pNode = pNode.next;
            slow = slow.next;
        }

        return pNode;
    }
}
