package indi.twc.algorithm.offer.No21to30;

/**
 * 二叉搜索树的后序遍历序列
 */
public class Main22 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] sequence, int start, int end) {
        if (end - start < 1) {
            return true;
        }

        int rootVal = sequence[end];
        int cutIndex = start;
        while (cutIndex < end) {
            if (sequence[cutIndex] < rootVal) {
                cutIndex ++;
            } else {
                break;
            }
        }

        for (int i = cutIndex + 1; i < end; i++) {
            if (sequence[i] < rootVal) {
                return false;
            }
        }

        return verify(sequence, start, cutIndex-1) && verify(sequence, cutIndex, end - 1);
    }

}
