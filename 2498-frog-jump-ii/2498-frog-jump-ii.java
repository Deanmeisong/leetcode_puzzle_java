class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length;
        if (n==2)
            return stones[1];        
        
        int ret = 0;
        for (int i=0; i+2<n; i++)
            ret = Math.max(ret, stones[i+2]-stones[i]);
        return ret;  
    }
}