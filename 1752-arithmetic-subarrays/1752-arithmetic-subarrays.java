class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < l.length; ++i) {
            ans.add(check(nums, l[i], r[i]));
        }
        return ans;
    }

    boolean check(int[] nums, int l, int r) {
        int n = r-l+1;
        Set<Integer> s = new HashSet<>();
        int a1 = 1<<30, a2 = -a1;
        for(int i = l; i <= r; ++i) {
            a1 = Math.min(a1, nums[i]);
            a2 = Math.max(a2, nums[i]);
            s.add(nums[i]);
        }
        if((a2-a1)%(n-1) != 0) return false;
        int d = (a2-a1)/(n-1);
        for(int i = 1; i < n; ++i) {
            if(!s.contains(a1+(i-1)*d)) return false;
        }
        return true;
    }
}