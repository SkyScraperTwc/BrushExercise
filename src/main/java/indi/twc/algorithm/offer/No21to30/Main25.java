package indi.twc.algorithm.offer.No21to30;

import indi.twc.algorithm.offer.common.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 二叉搜索树与双向链表
 */
public class Main25 {
    private TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        inOrder(pRootOfTree);
        while(pRootOfTree.left != null) pRootOfTree = pRootOfTree.left;
        return pRootOfTree;
    }

    private void inOrder(TreeNode node) {
        if(node == null) return;
        inOrder(node.left);
        node.left = pre;
        if(pre != null) pre.right = node;
        pre = node;
        inOrder(node.right);
    }
}
