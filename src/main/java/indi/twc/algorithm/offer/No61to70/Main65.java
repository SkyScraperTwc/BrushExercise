package indi.twc.algorithm.offer.No61to70;


/**
 * 矩阵中的路径
 */
public class Main65 {
    private int cnt = 0;
    private int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    private int rows;
    private int cols;
    private int threshold;
    private int[][] digitSum;

    public int movingCount(int threshold, int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        initDigitSum();
        boolean[][] hasVisited = new boolean[rows][cols];
        dfs(hasVisited, 0, 0);
        return cnt;
    }

    private void dfs(boolean[][] hasVisited, int r, int c) {
        if (r < 0 || r >= this.rows || c < 0 || c >= this.cols) return;
        if (hasVisited[r][c]) return;
        hasVisited[r][c] = true;
        if (this.digitSum[r][c] > this.threshold) return;
        this.cnt++;
        for (int i = 0; i < this.next.length; i++) {
            dfs(hasVisited, r + next[i][0], c + next[i][1]);
        }
    }

    private void initDigitSum() {
        int[] digitSumOne = new int[Math.max(rows, cols)];
        for (int i = 0; i < digitSumOne.length; i++) {
            int n = i;
            while (n > 0) {
                digitSumOne[i] += n % 10;
                n /= 10;
            }
        }
        this.digitSum = new int[rows][cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.digitSum[i][j] = digitSumOne[i] + digitSumOne[j];
            }
        }
    }
}
