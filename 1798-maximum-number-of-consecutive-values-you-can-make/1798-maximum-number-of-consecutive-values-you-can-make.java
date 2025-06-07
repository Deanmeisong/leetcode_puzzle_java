class Solution {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int ans = 1;
        for(int x : coins) {
            if(x > ans) break;
            ans += x;
        }
        return ans;
    }
}