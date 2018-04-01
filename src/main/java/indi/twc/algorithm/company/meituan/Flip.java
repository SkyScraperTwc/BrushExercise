package indi.twc.algorithm.company.meituan;

import java.util.Arrays;

public class Flip {
    public static void main(String[] args) {
        int[][] A = new int[][]{{0,0,0,0,0},{0,0,0,1,1},{0,1,0,1,0},{0,0,1,1,0},{0,0,0,1,0}};
        int[][] f = new int[][]{{2,2},{3,3},{4,4}};
        A = flipChess(A, f);
        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(A[i]));
        }
    }

    public static int[][] flipChess(int[][]  A, int[][] f) {
        for (int i = 0; i < f.length; i++) {
            int x = f[i][0] - 1;
            int y = f[i][1] - 1;
            A = handle(A, x, y);
        }
        return A;
    }

    public static int[][] handle(int[][] A, int x, int y) {
        if (x - 1 >= 0) {
            A[x-1][y] = swap(A[x-1][y]);
        }

        if (x + 1 <= 3) {
            A[x+1][y] = swap(A[x+1][y]);
        }

        if (y - 1 >= 0) {
            A[x][y-1] = swap(A[x][y-1]);
        }

        if (y + 1 <= 3) {
            A[x][y+1] = swap(A[x][y+1]);
        }

        return A;
    }

    public static int swap(int k) {
        if (k == 1) {
            return 0;
        } else {
            return 1;
        }
    }
}
