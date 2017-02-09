package zhonghcc.P0005_LongestPalindromicSubstring;

/**
 * Created by zhong on 2017/2/6.
 *
 Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

 Example:

 Input: "babad"

 Output: "bab"

 Note: "aba" is also a valid answer.
 Example:

 Input: "cbbd"

 Output: "bb"
 */
public class Solution2 {
    public String longestPalindrome(String s) {

        if(s.length()<=0)return "";
        char[] arr = s.toCharArray();
        String maxStr = String.valueOf(arr[0]);
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()){
                if(arr[i]==arr[i+1]){
                    String a = extendPalindrome(s,arr,i,i+1);
                    if(a.length()>maxStr.length()){
                        maxStr = a;
                    }
                }
            }
            if(i+2<s.length()){
                if(arr[i]==arr[i+2]){
                    String a = extendPalindrome(s,arr,i,i+2);
                    if(a.length()>maxStr.length()){
                        maxStr = a;
                    }
                }
            }
        }
        return maxStr;
    }
    public String extendPalindrome(String s,char[] arr,int start,int end){
        int i=start-1;
        int j=end+1;

        while(i>=0 && j <arr.length){
            if(arr[i]==arr[j]){
                start = i;
                end = j;
                i = i-1;
                j = j+1;
            }else{
                break;
            }
        }
        return s.substring(start,end+1);

    }
}
