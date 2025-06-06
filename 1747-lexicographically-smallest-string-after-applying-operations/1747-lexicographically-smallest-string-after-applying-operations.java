class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Deque<String> dq = new ArrayDeque<>();
        int n = s.length();
        dq.offer(s);
        Set<String> vis = new HashSet<>();
        vis.add(s);
        String ans = s;
   
        while(!dq.isEmpty()) {
            s = dq.poll();
            if(ans.compareTo(s) > 0) ans = s;
            char[] cs = s.toCharArray();
            for(int i=1; i < n; i+=2) {
                cs[i] = (char)(((cs[i]-'0'+a)%10)+'0');
            }
            String t1 = String.valueOf(cs);
            String t2 = s.substring(n - b) + s.substring(0, n - b);
            for(String t : List.of(t1, t2)) {
                if(vis.add(t)) {
                    dq.offer(t);
                }
            }
        }
        return ans;
    }
}