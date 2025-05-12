class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int s = 0;
        for(int x : nums) {
            s += x;
        }
        int[] ans = new int[n];
        int t = 0;
        for(int i = 0; i < n; ++i) {
            int v = (nums[i]*i) - t + (s-t) - (nums[i]*(n-i));
            ans[i] = v;
            t += nums[i];
        }
        return ans;
    }
}