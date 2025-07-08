class Solution {
    private char[] s;
    private char[] p;
    private int[] removable;
    public int maximumRemovals(String s, String p, int[] removable) {
        int l = 0, r = removable.length;
        this.s = s.toCharArray();
        this.p = p.toCharArray();
        this.removable = removable;
        while(l<r) {
            int mid = (l+r+1)>>1;
            if(check(mid)) {
                l = mid;
            } else {
                r = mid-1;
            }
        }
        return l;
    }

    private boolean check(int k) {
        boolean[] rv = new boolean[s.length];
        for(int i = 0; i < k; ++i) {
            rv[removable[i]] = true;
        }
        int i = 0, j = 0;
        while(i < s.length && j < p.length) {
            if(!rv[i] && p[j] == s[i]) {
                ++j;
            }
            ++i;
        }
        return j == p.length;
    }
}