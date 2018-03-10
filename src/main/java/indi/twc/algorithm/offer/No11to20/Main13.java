package indi.twc.algorithm.offer.No11to20;


import indi.twc.algorithm.offer.common.ListNode;

/**
 * 链表中倒数第k个结点
 */
public class Main13 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode listNode = head;
        for (int i = 2; i <= 10; i++) {
            ListNode node = new ListNode(i);
            listNode.next = node;
            listNode = node;
        }
        ListNode node = FindKthToTail(head, 3);
        System.out.println(node.val);

    }

    public static ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k < 0) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && k > 0) {
            fast = fast.next;
            k--;
        }

        if (k > 0) {
            return null;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
