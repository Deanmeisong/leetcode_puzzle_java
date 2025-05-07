class Solution {
    public int minOperations(int[] nums, int x) {
        int s = -x;
        int n = nums.length;
        for(int i = 0; i < n; ++i) {
            s += nums[i];
        }
        Map<Integer, Integer> vis = new HashMap<>();
        vis.put(0,-1);
        int t = 0, ans = -1;

        for(int i = 0; i < n; ++i) {
            t += nums[i];
            vis.putIfAbsent(t, i);
            if(vis.containsKey(t-s)) {
                ans = Math.max(ans, i-vis.get(t-s));
            }
        }
        return ans == -1 ? -1 : n-ans;
    }
}