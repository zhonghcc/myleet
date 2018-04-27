package zhonghcc.P0807_MaxIncreasetoKeepCitySkyline;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void maxIncreaseKeepingSkyline() throws Exception {
        int [][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        Solution solution =  new Solution();
        int ret = solution.maxIncreaseKeepingSkyline(grid);
        System.out.println(ret);
    }

}