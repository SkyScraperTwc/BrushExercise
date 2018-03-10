package indi.twc.algorithm.offer.No1to10;

/**
 * 二维数组中的查找
 */
public class Main {
    public static void main(String[] args) {
        Find(3,new int[3][3]);
    }

    public static boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0){
            return false;
        }

        int m = array.length;
        int n = array[0].length;
        int row = 0;
        int col = n-1;

        while (row < m && col >= 0){
            if (array[row][col] == target){
                return true;
            } else if (array[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;

    }
}
