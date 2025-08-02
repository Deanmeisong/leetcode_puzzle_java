class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        List<Integer>[] g = new List[n];
        Arrays.setAll(g, k->new ArrayList<>());
        int[] indg = new int[n];
        for(var r : relations) {
            int prev = r[0]-1, nxt = r[1]-1;
            g[prev].add(nxt);
            ++indg[nxt];
        }
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < n; ++i) {
            if(indg[i] == 0) q.offer(i);
        }
        int ans = 0;
        while(!q.isEmpty()) {
            ++ans;
            int size = q.size();
            while(size-- != 0) {
                int i = q.poll();
                --n;
                for(int j : g[i]) {
                    if(--indg[j] == 0) q.offer(j);
                }
            }
        }
        return n == 0 ? ans : -1;
    }
}