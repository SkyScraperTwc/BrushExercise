package indi.twc.algorithm.offer.No1to10;


/**
 * 跳台阶
 */
public class Main8 {
    public int JumpFloor(int target) {
        int f1 = 1;
        int f2 = 2;

        if (target == 1) {
            return f1;
        }
        if (target == 2) {
            return f2;
        }

        int fn = 0;
        for (int i = 3; i <= target ; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}
