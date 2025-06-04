class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int m = groups.length, n = nums.length;
        int i = 0, j = 0;
        while(i < m && j < n) {
            int[] g = groups[i];
            if(check(j, g, nums)) {
                j += g.length;
                i += 1;
            } else {
                j += 1;
            }
        }
        return i == m;
    }

    private boolean check(int j, int[] group, int[] nums) {
        int i = 0;
        while(i < group.length && j < nums.length) {
            if(group[i] != nums[j]) return false;
            ++i;  ++j;
        }
        return i == group.length;
    }
}