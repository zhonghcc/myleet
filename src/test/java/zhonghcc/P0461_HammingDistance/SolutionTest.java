package zhonghcc.P0461_HammingDistance;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhong on 2017/2/7.
 */
public class SolutionTest {

    @Test
    public void testHammingDistance() throws Exception {
        Solution s = new Solution();
        Assert.assertEquals(2,s.hammingDistance(1,4));
        Assert.assertEquals(1,s.hammingDistance(1,3));

    }
}