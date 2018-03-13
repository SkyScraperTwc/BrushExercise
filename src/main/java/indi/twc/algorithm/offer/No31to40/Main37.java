package indi.twc.algorithm.offer.No31to40;


import indi.twc.algorithm.offer.common.TreeNode;

/**
 * 二叉树的深度
 */
public class Main37 {
    public static void main(String[] args) {

    }

    public static int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);

        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }

    }
}
