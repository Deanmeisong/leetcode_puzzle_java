class Solution {
    private char[] s;
    public boolean splitString(String s) {
        this.s = s.toCharArray();
        return dfs(0,-1);
    }
    boolean dfs(int i, long x) {
        if(i >= s.length) return true;
        int r = (x == -1) ? s.length-1 : s.length;     
        long y = 0;
        for(int j=i; j<r; ++j) {
            y = 10*y+s[j]-'0';
            if((x==-1||x-y==1)&&dfs(j+1,y)) return true;           
        }
        return false;
    }
}