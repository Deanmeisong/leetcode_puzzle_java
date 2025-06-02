class Solution {
    private static final int mod = (int)1e9+7;
    public int countHomogenous(String s) {
        int n = s.length();
        int cnt = 0;
        long ans = 0;
        for(int i = 0, j = 0; i < n; i = j) {
            j = i;
            while(j < n && s.charAt(i) == s.charAt(j)) {
                ++j;
            }
            cnt = j-i;
            ans += (long) (1 + cnt) * cnt / 2;
            ans %= mod;
        }
        return (int)ans;
    }
}