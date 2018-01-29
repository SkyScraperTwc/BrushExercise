package indi.twc.algorithm.dynamic;

/**
 * 动态规划：01背包问题
 * 这是最基础的背包问题，特点是：每种物品仅有一件。
 */
public class BackpackDemo {
    public static void main(String[] args) {
        // 物品个数
        int number = 6;
        // 背包体积
        int volumeTotalSize = 10;
        // 第 i 个物品的体积
        int volume[] = {-1,5,6,5,1,19,7};
        // 第 i 个物品的价值
        int worth[] = {-1,2,3,1,4,6,5};
        // 状态
        int F[][] = new int[number+1][volumeTotalSize + 1];

        //对于第 i 个物品
        for (int i = 1; i <= number; i++){
            //对于v从0～volumeTotalSize
            for (int v = 0; v <= volumeTotalSize; v++) {
                //第 i 个不放
                F[i][v] = F[i-1][v];
                // 如果比它大，再放第i个
                if ((v - volume[i])  >= 0 && (F[i][v] < F[i-1][v-volume[i]] + worth[i])){
                    F[i][v] = F[i-1][v-volume[i]] + worth[i];
                }
                System.out.println("F["+i+"]["+v+"]"+"-------"+F[i][v]);
            }
        }
        System.out.println( "最大价值是："+F[number][volumeTotalSize]);
    }
}
