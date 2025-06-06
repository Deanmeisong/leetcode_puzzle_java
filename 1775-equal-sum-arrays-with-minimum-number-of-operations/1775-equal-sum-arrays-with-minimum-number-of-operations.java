class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        int s1 = Arrays.stream(nums1).sum();
        int s2 = Arrays.stream(nums2).sum();
        if(s1 == s2) return 0;
        if(s1 > s2) return minOperations(nums2, nums1);
        int d = s2 - s1;
        int[] arr = new int[nums1.length+nums2.length];
        int k = 0;
        for(int x : nums1) {
            arr[k++] = 6 - x;
        }
        for(int x : nums2) {
            arr[k++] = x - 1;
        }
        Arrays.sort(arr);
        for(int i = 1, j = arr.length-1; j >= 0; ++i, --j) {
            d -= arr[j];
            if(d <= 0) return i;
        }
        return -1;
    }
}