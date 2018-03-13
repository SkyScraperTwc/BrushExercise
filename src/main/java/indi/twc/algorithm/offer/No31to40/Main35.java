package indi.twc.algorithm.offer.No31to40;


import indi.twc.algorithm.offer.common.ListNode;
import java.util.Stack;

/**
 * 两个链表的第一个公共结点
 */
public class Main35 {
    public static void main(String[] args) {

    }

    /**
     * 暴力解法
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        for (ListNode node1 = pHead1; node1 != null; node1 = node1.next) {
            for (ListNode node2 = pHead2; node2 != null; node2 = node2.next) {
                if (node1 == node2) {
                    return node1;
                }
            }
        }
        return null;
    }

    /**
     * 两个链表长度相减
     * @param pHead1
     * @param pHead2
     * @return
     */
    public static ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        int length1 = 0;
        int length2 = 0;

        ListNode node1 = pHead1;
        ListNode node2 = pHead2;
        while (node1 != null) {
            length1++;
            node1 = node1.next;
        }
        while (node2 != null) {
            length2++;
            node2 = node2.next;
        }

        int k;
        ListNode result;
        if (length1 >= length2) {
            k = length1 - length2;
            result = getNode(k ,pHead1, pHead2);
        } else {
            k = length2 - length1;
            result = getNode(k, pHead2, pHead1);
        }
        return result;
    }

    public static ListNode getNode(int k ,ListNode pHeadA, ListNode pHeadB) {
        while (k > 0) {
            pHeadA = pHeadA.next;
            k--;
        }

        while (pHeadA != null && pHeadB != null) {
            if (pHeadA == pHeadB) {
                return pHeadA;
            } else {
                pHeadA = pHeadA.next;
                pHeadB = pHeadB.next;
            }
        }
        return null;
    }

    /**
     * 利用栈数据结构
     * @param pHead1
     * @param pHead2
     * @return
     */
    public static ListNode FindFirstCommonNode3(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();

        ListNode node1 = pHead1;
        ListNode node2 = pHead2;
        while (node1 != null) {
            stack1.push(node1);
            node1 = node1.next;
        }
        while (node2 != null) {
            stack2.push(node2);
            node2 = node2.next;
        }

        while (stack1.size() > 0 && stack2.size() > 0) {
            ListNode node = stack1.peek();
            if (stack1.pop() == stack2.pop()) {

                if (stack1.size() == 0 || stack2.size() == 0) {
                    return node;
                }

                if (stack1.peek() != stack2.peek()) {
                    return node;
                }
            }
        }
        return null;
    }
}
