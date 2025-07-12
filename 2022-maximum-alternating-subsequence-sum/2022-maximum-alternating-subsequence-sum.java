class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] f = new long[n+1];
        long[] g = new long[n+1];
        f[0] = 0; g[0] = 0;
        for(int i = 1; i <= n; ++i) {
            f[i] = Math.max(g[i-1]-nums[i-1],f[i-1]);
            g[i] = Math.max(f[i-1]+nums[i-1],g[i-1]);
        }
        return Math.max(f[n],g[n]);

        // int f = 0, g = 0;
        // for(int i = 0; i < n; ++i) {
        //     int ff = f, gg = g;
        //     f = Math.max(gg-nums[i], ff);
        //     g = Math.max(ff+nums[i],gg);
        // }
        // return Math.max(f, g);
   
    }
}