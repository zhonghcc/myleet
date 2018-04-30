package zhonghcc.P0804_UniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

class Solution {

    String[] dic = {".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.","---",
            ".--.","--.-",".-.","...","-","..-","...-",".--",
            "-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> sets = new HashSet<>();
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()){
                int index = c-'a';
                sb.append(dic[index]);
            }
            sets.add(sb.toString());
        }
        return sets.size();
    }
}
