class Solution {
    public long minimumPerimeter(long neededApples) {
        long left = 1, right = 1000000; // right bound covers neededApples up to 10^15
        long result = right;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long apples = 2 * mid * (mid + 1) * (2 * mid + 1); // Formula for total apples
            
            if (apples >= neededApples) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return 8 * result;
    }
}