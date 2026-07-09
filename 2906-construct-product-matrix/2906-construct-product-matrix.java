class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        final int MOD = 12345;

        int rows = grid.length;
        int cols = grid[0].length;
        int size = rows * cols;

        long[] prefix = new long[size];
        long[] suffix = new long[size];

        // Prefix products
        prefix[0] = 1;
        for (int i = 1; i < size; i++) {
            int r = (i - 1) / cols;
            int c = (i - 1) % cols;
            prefix[i] = (prefix[i - 1] * grid[r][c]) % MOD;
        }

        // Suffix products
        suffix[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            int r = (i + 1) / cols;
            int c = (i + 1) % cols;
            suffix[i] = (suffix[i + 1] * grid[r][c]) % MOD;
        }

        // Construct answer
        int[][] ans = new int[rows][cols];

        for (int i = 0; i < size; i++) {
            int r = i / cols;
            int c = i % cols;
            ans[r][c] = (int) ((prefix[i] * suffix[i]) % MOD);
        }

        return ans;
    }
}