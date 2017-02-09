package zhonghcc.P0500_KeyboardRow;

import java.util.*;

/**
 * Created by zhong on 2017/2/9.
 */
public class Solution {
    public String[] findWords(String[] words) {

        String[] result ;
        ArrayList<String> list = new ArrayList<String>();

        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();
        Set<String> s3 = new HashSet<String>();

        addElem(s1,new String[]{"q","w","e","r","t","y","u","i","o","p","Q","W","E","R","T","Y","U","I","O","P"});
        addElem(s2,new String[]{"a", "s", "d", "f", "g", "h", "j", "k", "l","A", "S", "D", "F", "G", "H", "J", "K", "L"});
        addElem(s3,new String[]{"z", "x", "c", "v", "b", "n", "m","Z", "X", "C", "V", "B", "N", "M"});

        for(String word : words){
            char[] arr = word.toCharArray();
            Set<String> s=s1;
            String a0 = String.valueOf(arr[0]);
            if(s1.contains(a0)){
                s = s1;
            }
            if(s2.contains(a0)){
                s = s2;
            }
            if(s3.contains(a0)){
                s = s3;
            }
            boolean flag = true;
            for(int i=1;i<arr.length;i++){
                if(s.contains(String.valueOf(arr[i]))){
                    ;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(word);
            }
        }

        result = new String[list.size()];
        result = list.toArray(result);
        return result;

    }

    public void addElem(Set<String> s,String[] arr){
        for(String str:arr){
            s.add(str);
        }
    }
}
