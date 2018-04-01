package indi.twc.algorithm.offer.No51to60;


import indi.twc.algorithm.offer.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 对称的二叉树
 */
public class Main57 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        System.out.println(list);
    }

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        ArrayList<Integer> leftList = leftForeach(pRoot);
        ArrayList<Integer> rightList = rightForeach(pRoot);

        for (int i = 0; i < leftList.size(); i++) {
            if (leftList.get(i) != rightList.get(i)) {
                return false;
            }
        }
        return true;
    }

    private ArrayList<Integer> leftForeach(TreeNode pRoot) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
                list.add(node.val);
            } else {
                list.add(null);
            }
        }
        return list;
    }

    private ArrayList<Integer> rightForeach(TreeNode pRoot) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                queue.add(node.right);
                queue.add(node.left);
                list.add(node.val);
            } else {
                list.add(null);
            }
        }
        return list;
    }
}
