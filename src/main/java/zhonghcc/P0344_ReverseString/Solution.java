package zhonghcc.P0344_ReverseString;

/**
 * Created by zhong on 2017/2/6.
 */
public class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i=0;i<=num;i++){
            int j=i;
            int count=0;
            while(j!=0){
                count += j&1;
                j=j>>1;
                //System.out.println("i="+i+"j="+j);
            }
            res[i]=count;
        }
        return res;

    }
}
