/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    int guessNumber(int n) {
        int l = 0, r = n;
        while(l + 1 < r) {
            int m = (r - l) / 2 + l;
            if(guess(m) == 0) return m;
            if(guess(m) == 1) l = m;
            else r = m;
            
        }
        
        if(guess(l) == 0) return l;
        if(guess(r) == 0) return r;
        return -1;
        
    }
    
private:
    
};