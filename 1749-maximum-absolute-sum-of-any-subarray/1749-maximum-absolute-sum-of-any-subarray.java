class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int f=0, g=0, ans = 0;
        for(int x : nums) {
            f = Math.max(0, f) + x;
            g = Math.min(0, g) + x;
            ans = Math.max(ans, Math.max(f, Math.abs(g)));
        }
        return ans;
    }
}