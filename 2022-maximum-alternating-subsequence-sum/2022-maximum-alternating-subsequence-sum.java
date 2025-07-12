class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        // int[] f = new int[n+1];
        // int[] g = new int[n+1];
        // f[0] = 0; g[0] = 0;
        // for(int i = 1; i <= n; ++i) {
        //     f[i] = Math.max(g[i-1]-nums[i-1],f[i-1]);
        //     g[i] = Math.max(f[i-1]+nums[i-1],g[i-1]);
        // }
        // return Math.max(f[n],g[n]);

        // int f = 0, g = 0;
        // for(int i = 0; i < n; ++i) {
        //     int ff = f, gg = g;
        //     f = Math.max(gg-nums[i], ff);
        //     g = Math.max(ff+nums[i],gg);
        // }
        // return Math.max(f, g);
        long ret = 0;
        int i = 0;
        while(i < nums.length) {
            if(i+1 < nums.length && nums[i] > nums[i+1])
                ret += nums[i]-nums[i+1];
            ++i;
        }
        ret += nums[nums.length-1];
        return ret;
    }
}