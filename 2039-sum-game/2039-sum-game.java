class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int cnt1 = 0, cnt2 = 0, s1 = 0, s2 = 0;
        for(int i = 0; i < n/2; ++i) {
            char c = num.charAt(i);
            if(c == '?') {
                ++cnt1;
            } else {
                s1 += c - '0';
            }
        }

        for(int i = n/2; i < n; ++i) {
            char c = num.charAt(i);
            if(c == '?') {
                ++cnt2;
            } else {
                s2 += c - '0';
            }
        }

        return (cnt2+cnt1)%2 == 1 || (s1-s2) != 9*(cnt2-cnt1)/2;
    }
}