class Solution {
    public int numberOfBeams(String[] bank) {
        int ret = 0, pre = 0;
        for (String row : bank) {
            int cur = 0;
            for (int i = 0; i < row.length(); ++i) {
                cur += row.charAt(i) - '0';
            }
            if (cur > 0) {
                ret += pre * cur;
                pre = cur;
            }
        }
        return ret;
    }
}