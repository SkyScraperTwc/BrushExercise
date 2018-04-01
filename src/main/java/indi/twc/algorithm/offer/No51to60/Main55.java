package indi.twc.algorithm.offer.No51to60;


import indi.twc.algorithm.offer.common.ListNode;

/**
 * 删除链表中重复的结点
 */
public class Main55 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null)
            return null;
        ListNode next = pHead.next;
        if (next == null)
            return pHead;
        if (pHead.val == next.val) {
            while (next != null && pHead.val == next.val)
                next = next.next;
            return deleteDuplication(next);
        }
        pHead.next = deleteDuplication(pHead.next);
        return pHead;
    }

}
