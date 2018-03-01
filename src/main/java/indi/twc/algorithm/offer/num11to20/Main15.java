package indi.twc.algorithm.offer.num11to20;


import indi.twc.algorithm.offer.common.ListNode;

/**
 * 合并两个排序的链表
 */
public class Main15 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode listNode = list1;
        for (int i = 3; i <= 20; i=i+2) {
            ListNode node = new ListNode(i);
            listNode.next = node;
            listNode = node;
        }

        ListNode list2 = new ListNode(2);
        ListNode listNode2 = list2;
        for (int i = 4; i <= 20; i=i+2) {
            ListNode node = new ListNode(i);
            listNode2.next = node;
            listNode2 = node;
        }
        list1.print();
        list2.print();

        ListNode newList = Merge(list1, list2);
        newList.print();
    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null) cur.next = list1;
        if (list2 != null) cur.next = list2;
        return head.next;
    }
}
