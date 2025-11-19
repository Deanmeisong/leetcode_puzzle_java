class Solution {
    public int totalSteps(int[] nums) {
        Deque<Integer> stk = new ArrayDeque<>();
        int ans = 0;
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            int f = 0;
            while (!stk.isEmpty() && nums[i] > nums[stk.peek()]) {
                f = Math.max(f + 1, dp[stk.pop()]);
                ans = Math.max(ans, f);
            }
            dp[i] = f;
            stk.push(i);
        }
        return ans;
    }
}