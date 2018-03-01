package indi.twc.algorithm.offer.num1to10;

/**
 * 跳台阶
 */
public class Main9 {
    public int JumpFloorII(int target) {
        int f1 = 1;
        int f2 = 2;
        if (target == 1) {
            return f1;
        }

        if (target == 2) {
            return f2;
        }

        int fn = 0;
        for (int i = 3; i <=target ; i++) {
            fn = 2*f2;
            f2 = fn;
        }
        return fn;
    }
}
