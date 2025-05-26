class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = candiesCount.length;
        long[] s = new long[n+1];
        for(int i = 0; i < n; ++i) {
            s[i+1] = s[i] + candiesCount[i];
        }
        int m = queries.length;
        boolean[] ans = new boolean[m];
        for(int i = 0; i < m; ++i) {
            int t = queries[i][0]; int d = queries[i][1]; int mx = queries[i][2];
            long least = d; long most = (long)(d+1)*mx;
            ans[i] = least < s[t + 1] && most > s[t];
        }
        return ans;
    }
}