package indi.twc.algorithm.offer.No21to30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 复杂链表的复制
 */
public class Main24 {
    public static void main(String[] args) {

    }

    /**
     * nodeMap辅助空间方式
     * @param pHead
     * @return
     */
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }

        RandomListNode node = pHead;
        List<RandomListNode> nodeList = new ArrayList<>();
        Map<RandomListNode, RandomListNode> nodeMap = new HashMap<>();

        while (node != null) {
            RandomListNode copyNode = new RandomListNode(node.label);
            nodeList.add(copyNode);
            nodeMap.put(node, copyNode);
            node = node.next;
        }

        for (int i = 0; i < nodeList.size() - 1; i++) {
            RandomListNode listNode = nodeList.get(i);
            listNode.next = nodeList.get(i + 1);
        }

        node = pHead;
        while (node != null) {
            RandomListNode copyNode = nodeMap.get(node);
            copyNode.random = nodeMap.get(node.random);
            node = node.next;
        }

        return nodeList.get(0);
    }

    public RandomListNode Clone2(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }

        RandomListNode node = pHead;
        while (node != null) {
            RandomListNode newNode = new RandomListNode(node.label);
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }

        node = pHead;
        while (node != null) {
            if (node.random != null) {
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }

        RandomListNode newHead = pHead.next;
        RandomListNode pCur = pHead;
        node = newHead;
        while (node != null) {
            pCur.next = pCur.next.next;
            if (node.next != null) {
                node.next = node.next.next;
            }
            node = node.next;
            pCur = pCur.next;
        }

        return newHead;
    }
}

class RandomListNode {
    public int label;
    public RandomListNode next = null;
    public RandomListNode random = null;

    public RandomListNode(int label) {
        this.label = label;
    }
}