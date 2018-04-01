package indi.twc.algorithm.offer.No61to70;


/**
 * 矩阵中的路径
 */
public class Main64 {
    private int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    private int rows;
    private int cols;

    public boolean hasPath(char[] array, int rows, int cols, char[] str) {
        if (rows == 0 || cols == 0) return false;
        this.rows = rows;
        this.cols = cols;
        boolean[][] hasUsed = new boolean[rows][cols];
        char[][] matrix = buildMatrix(array);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (backtracking(matrix, str, hasUsed, 0, i, j)) return true;
            }
        }
        return false;
    }

    private boolean backtracking(char[][] matrix, char[] str, boolean[][] hasUsed, int pathLen, int row, int col) {
        if (pathLen == str.length) return true;
        if (row < 0 || row >= rows || col < 0 || col >= cols) return false;
        if (matrix[row][col] != str[pathLen]) return false;
        if (hasUsed[row][col]) return false;
        hasUsed[row][col] = true;
        for (int i = 0; i < next.length; i++) {
            if (backtracking(matrix, str, hasUsed, pathLen + 1, row + next[i][0], col + next[i][1]))
                return true;
        }
        hasUsed[row][col] = false;
        return false;
    }

    private char[][] buildMatrix(char[] array) {
        char[][] matrix = new char[rows][cols];
        for (int i = 0, idx = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = array[idx++];
            }
        }
        return matrix;
    }
}
