class Solution {
    char[] s;
    int k;
    public int maxConsecutiveAnswers(String answerKey, int k) {
        this.s = answerKey.toCharArray();
        this.k = k;
        return Math.max(f('F'), f('T'));
    }

    private int f(char c) {
        int l = 0, cnt = 0;
        for(char ch : s) {
            cnt += ch == c ? 1 : 0;
            if(cnt > k) cnt -= s[l++] == c ? 1 : 0;
        }
        return s.length - l;
    }
}