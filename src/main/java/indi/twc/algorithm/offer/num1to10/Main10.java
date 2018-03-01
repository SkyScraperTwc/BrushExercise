package indi.twc.algorithm.offer.num1to10;

/**
 * 跳台阶
 */
public class Main10 {
    public int RectCover(int target) {
        if (target <= 2) return target;
        return RectCover(target - 1) + RectCover(target - 2);
    }
}
