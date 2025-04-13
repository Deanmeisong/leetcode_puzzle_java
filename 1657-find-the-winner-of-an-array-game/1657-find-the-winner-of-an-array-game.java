class Solution {
    public int getWinner(int[] arr, int k) {
        int mx = arr[0];
        int cnt = 0;
        for(int i = 1; i < arr.length; ++i) {
            if(mx < arr[i]) {
                mx = arr[i];
                cnt = 1;
            } else {
                ++cnt;
            }
            if(cnt == k) break;
        }
        return mx;
    }
}