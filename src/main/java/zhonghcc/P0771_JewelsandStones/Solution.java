package zhonghcc.P0771_JewelsandStones;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] chars = J.toCharArray();
        Set<Character> sets = new HashSet<>();

        for(char c :chars){
            sets.add(c);
        }
        char[] stones = S.toCharArray();
        int count = 0;
        for(char s : stones){
            if(sets.contains(s)){
                count = count + 1;
            }
        }
        return count;
    }
}
