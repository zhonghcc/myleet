package zhonghcc.P0003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int p=0,q=0;

        int[] set = new int[256];
        while(q<s.length()){
            char cur = s.charAt(q);
            //老版
//            if(set[cur]==1){
//                while(s.charAt(p)!=cur){
//
//
//                    set[s.charAt(p)]=0;
//                    p++;
//                }
//                set[s.charAt(p)]=0;
//
//                p++;
//
//            }
//            set[cur]=1;

            //防止回溯
            if(set[cur]>0&&set[cur]>p){
                p=set[cur];

            }
            set[cur]=q+1;

            if(q-p+1>max){

                max = q-p+1;
            }
            q++;

        }
        return max;
    }
}