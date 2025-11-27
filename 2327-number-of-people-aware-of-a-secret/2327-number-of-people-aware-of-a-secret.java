class Solution {
    private static final long M = 1000000007;
    
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n + 1]; // dp[i]: # of new persons who know the news in the i-th day
        
        dp[1] = 1;
        
        long ret = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + delay; j < i + forget; j++) {
                if (j > n) break;
                dp[j] += dp[i];
                dp[j] %= M;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (i + forget > n) {
                ret = (ret + dp[i]) % M;
            }
        }
        
        return (int) ret;
    }
}