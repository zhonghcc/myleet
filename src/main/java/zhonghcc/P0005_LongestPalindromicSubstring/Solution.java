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
public class Solution {
    public String longestPalindrome(String s) {

        if(s.length()<=0)return "";
        char[] arr = s.toCharArray();
        int max = 1;
        String maxStr = String.valueOf(arr[0]);
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=i+max;j--){
                if(i-j==1){break;}
                if(isPalindrome(arr,i,j)){
                    int len = j-i+1;
                    if(len>max){
                        max=len;
                        maxStr = s.substring(i,j+1);

                    }
                }
            }
        }
        return maxStr;
    }
    public boolean isPalindrome(char[] arr,int start,int end){
        for(int i=start;i<=(start+end)/2;i++){
            int b = end-(i-start);
            if(arr[i]!=arr[b]){
                return false;
            }
        }
        return true;
    }
}
