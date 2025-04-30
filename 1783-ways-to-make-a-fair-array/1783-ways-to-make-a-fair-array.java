class Solution {
    public int waysToMakeFair(int[] nums) {
        int s1 = 0, s2 = 0, n = nums.length, ans = 0;
        for(int i = 0; i < n; ++i) {
            s1 += (i%2 == 0) ? nums[i] : 0;
            s2 += (i%2 == 1) ? nums[i] : 0;
        }
        int t1 = 0, t2 = 0;
        for(int i = 0; i < n; ++i) {
            int v = nums[i];
            if(i%2 == 0 && s1 - v + t2 - t1 == s2 + t1 - t2) ++ans;
            if(i%2 == 1 && s1 + t2 - t1 == s2 - v + t1 - t2) ++ans;
            if(i%2 == 0) t1 += v;
            if(i%2 == 1) t2 += v;
        }
        return ans;
    }
}