package indi.twc.algorithm.offer.No21to30;

import indi.twc.algorithm.offer.common.TreeNode;

import java.util.*;

/**
 * 从上往下打印二叉树
 */
public class Main21 {
    public static void main(String[] args) {
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
            list.add(treeNode.val);
        }

        return list;
    }
}
