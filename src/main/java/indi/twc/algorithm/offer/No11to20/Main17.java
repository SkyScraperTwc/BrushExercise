package indi.twc.algorithm.offer.No11to20;


import indi.twc.algorithm.offer.common.TreeNode;

import java.util.Stack;

/**
 * 二叉树的镜像
 */
public class Main17 {
    //递归版本
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tree = root.left;
        root.left = root.right;
        root.right = tree;
        Mirror(root.left);
        Mirror(root.right);
    }

    //非递归版本
    public void Mirror2(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (stack.size() > 0) {
            TreeNode treeNode = stack.pop();

            if (treeNode.left != null || treeNode.right != null) {
                TreeNode temp = treeNode.left;
                treeNode.left = treeNode.right;
                treeNode.right = temp;
            }

            if (treeNode.left != null) {
                stack.add(treeNode.left);
            }

            if (treeNode.right != null) {
                stack.add(treeNode.right);
            }
        }
    }
}
