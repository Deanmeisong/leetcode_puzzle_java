class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int x = target[0], y = target[1], z = target[2];
        int d = 0, f = 0, e = 0;
        for(var t : triplets) {
            if(t[0] <= x && t[1] <= y && t[2] <= z) {
                d = Math.max(d, t[0]);
                f = Math.max(f, t[1]);
                e = Math.max(e, t[2]);
            }
        }
        return d == x && f == y && z == e;
    }
}