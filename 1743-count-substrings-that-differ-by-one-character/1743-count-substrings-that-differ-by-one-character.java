class Solution {
    public int countSubstrings(String s, String t) {
        int ans = 0;
        int n = s.length(), m = t.length();
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < m; ++j) {
                if(s.charAt(i) != t.charAt(j)) {
                    int l = 0, r = 0;
                    while(i-l>0 && j-l>0 && s.charAt(i-l-1) == t.charAt(j-l-1)) {
                        ++l;
                    }
                    while(i+r<n-1 && j+r<m-1 && s.charAt(i+r+1) == t.charAt(j+r+1)) {
                        ++r;
                    }
                    ans += (l+1)*(r+1);
                }
            }
        return ans;
    }
}