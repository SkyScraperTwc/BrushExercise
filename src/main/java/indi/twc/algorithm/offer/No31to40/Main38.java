package indi.twc.algorithm.offer.No31to40;


import indi.twc.algorithm.offer.common.TreeNode;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树
 */
public class Main38 {
    public static void main(String[] args) {

    }
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }

        int left = Main37.TreeDepth(root.left);
        int right = Main37.TreeDepth(root.right);

        if (Math.abs(left - right) > 1) {
            return false;
        } else {
            return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }

    }
}
