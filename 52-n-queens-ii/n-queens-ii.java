class Solution {
    private int solve(int col, int n, int[] lrow, int[] ldiag, int[] udiag) {
        if (col == n) {
            return 1;
        }
        int cnt = 0;
        for (int row = 0; row < n; row++) {
            if (lrow[row] == 0 && ldiag[row + col] == 0 && udiag[n - 1 + col - row] == 0) {
                lrow[row] = 1;
                ldiag[row + col] = 1;
                udiag[(n - 1) + (col - row)] = 1;

                cnt += solve(col + 1, n, lrow, ldiag, udiag);
                lrow[row] = 0;
                ldiag[row + col] = 0;
                udiag[(n - 1) + (col - row)] = 0;
            }
        }
        return cnt;
    }
    public int totalNQueens(int n) {
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2 * n - 1];
        int[] lowerDiagonal = new int[2 * n - 1];

        return solve(0, n, leftRow, lowerDiagonal, upperDiagonal);
    }
}