package indi.twc.algorithm.offer.No61to70;


import indi.twc.algorithm.offer.common.TreeNode;

import java.util.*;

/**
 * 二叉搜索树的第k个结点
 */
public class Main61 {

    private static TreeNode treeNode;
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        TreeNode node = KthNode(treeNode,1);
        System.out.println(node.val);
    }

    public static TreeNode KthNode(TreeNode pRoot, int k) {
        if (k == 0) {
            return null;
        }
        if (pRoot == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        foreach(pRoot, list);
        if (k > list.size()) {
            return null;
        }
        int value = list.get(k - 1);
        foreachForNum(pRoot, value);
        return treeNode;
    }

    private static ArrayList<Integer> foreach(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            return list;
        }
        list = foreach(node.left, list);
        list.add(node.val);
        list = foreach(node.right, list);
        return list;
    }

    private static void foreachForNum(TreeNode node, int value) {
        if (node != null && node.val == value) {
            treeNode = node;
        }
        if (node != null) {
            foreachForNum(node.left, value);
            foreachForNum(node.right, value);
        }
    }
}
