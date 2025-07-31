class Solution {
    public long gridGame(int[][] grid) {
        long ans = Long.MAX_VALUE;
        long s1 = 0, s2 = 0;
        for(int x : grid[0]) {
            s1 += x;
        }
        for(int i = 0; i < grid[0].length; ++i) {
            s1 -= grid[0][i];
            ans = Math.min(ans, Math.max(s1,s2));
            s2 += grid[1][i];
        }
        return ans;
    }
}