package indi.twc.algorithm.offer.No21to30;

import indi.twc.algorithm.offer.common.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 二叉树中和为某一值的路径
 */
public class Main23 {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int currentSum = 0;
        handle(root, target, stack, currentSum, pathList);
        return pathList;
    }

    private void handle(TreeNode treeNode,
                         int target,
                         Stack<Integer> stack,
                         int currentSum,
                         ArrayList<ArrayList<Integer>> pathList) {
        currentSum = currentSum + treeNode.val;
        stack.push(treeNode.val);
        if (treeNode.left == null && treeNode.right == null) {
            if (currentSum == target) {
                ArrayList<Integer> list = new ArrayList<>(stack);
                pathList.add(list);
            }
        }

        if (treeNode.left != null) {
            handle(treeNode.left, target, stack, currentSum, pathList);
        }

        if (treeNode.right != null) {
            handle(treeNode.right, target, stack, currentSum, pathList);
        }
        stack.pop();
    }
 }
