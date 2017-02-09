package zhonghcc.P0461_HammingDistance;

/**
 * Created by zhong on 2017/2/7.
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int i=x^y;
        int dis = 0;
        while(i>0){
            if(i%2==1){
                dis++;
            }
            i=i>>1;
        }
        return dis;
    }
}
