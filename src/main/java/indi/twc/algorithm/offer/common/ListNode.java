package indi.twc.algorithm.offer.common;

public class ListNode {
    public int val;
    public ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }

    public void print() {
        ListNode node = this;
        while (node!=null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
