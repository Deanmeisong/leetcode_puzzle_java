class Solution {
    private int n = 0;
    private int[] res;
    private boolean[] used;
    public int[] constructDistancedSequence(int n) {
        this.n = n;
        this.res = new int[2*n-1];
        this.used = new boolean[n+1];
        dfs(0);
        return res;
    }

    private boolean dfs(int pos) {
        if(pos == 2*n - 1) return true;
        if(res[pos] != 0) return dfs(pos+1);
        for(int d = n; d > 0; --d) {
            if(used[d]) continue;
            if(d > 1 && (pos + d >= 2*n - 1 || res[pos+d] != 0)) continue;
            used[d] = true;
            res[pos] = d;
            if(d>1) res[pos+d] = d;
            if(dfs(pos+1)) return true;
            used[d] = false;
            res[pos] = 0;
            if(d>1) res[pos+d] = 0;
        }
        return false;
    }
}