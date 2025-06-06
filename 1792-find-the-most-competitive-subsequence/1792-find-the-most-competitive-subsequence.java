class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Deque<Integer> stk = new ArrayDeque<>();
        int n = nums.length;
        for(int i = 0; i < n; ++i) {
            while(!stk.isEmpty() && stk.peek()>nums[i] && n-i+stk.size()>k) {
                stk.pop();
            }
            if(stk.size()<k){
                stk.push(nums[i]);
            }
        }
        int[] ans = new int[stk.size()];
        for(int i = ans.length-1; i>=0; --i) {
            ans[i] = stk.pop();
        }
        return ans;
    }
}