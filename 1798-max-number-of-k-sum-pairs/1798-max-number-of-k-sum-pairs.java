class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = nums.length-1;
        int ans = 0;
        while(l < r) {
            int sum = nums[l] + nums[r];
            if(sum == k) {
                ++l; --r; ++ans;
            } else if(sum < k) {
                ++l;
            } else if(sum > k) {
                --r;
            }
        }
        return ans;
    }
}