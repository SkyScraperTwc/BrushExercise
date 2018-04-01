package indi.twc.algorithm.offer.No51to60;


import indi.twc.algorithm.offer.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 按之字形顺序打印二叉树
 */
public class Main58 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        System.out.println(list);
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null) return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (reverse) Collections.reverse(list);
            reverse = !reverse;
            ret.add(list);
        }
        return ret;
    }
}
