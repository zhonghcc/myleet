package zhonghcc.P0338_CountingBits;

/**
 * Created by zhong on 2017/2/6.
 */
public class Solution {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        char[] arr2 = new char[arr.length];
        int i=arr.length-1;
        for(char c : arr){
            arr2[i--]=c;
        }
        return String.valueOf(arr2);
    }
}
