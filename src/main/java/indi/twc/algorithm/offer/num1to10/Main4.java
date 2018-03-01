package indi.twc.algorithm.offer.num1to10;

import indi.twc.algorithm.offer.common.TreeNode;

/**
 * 重建二叉树
 */
public class Main4 {
    public static void main(String[] args) {

    }

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int[] in, int inL, int inR) {
        if (preL == preR) return new TreeNode(pre[preL]);
        if (preL > preR || inL > inR) return null;
        TreeNode root = new TreeNode(pre[preL]);
        int midIdx = inL;
        while (midIdx <= inR && in[midIdx] != root.val) midIdx++;
        int leftTreeSize = midIdx - inL;
        root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, in, inL, inL + leftTreeSize - 1);
        root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, in, inL + leftTreeSize + 1, inR);
        return root;
    }
}
