package zhonghcc.P0005_LongestPalindromicSubstring;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhong on 2017/2/6.
 */
public class SolutionTest {

    @Test
    public void testLongestPalindrome() throws Exception {

        Solution s = new Solution();
        Assert.assertEquals("bab",s.longestPalindrome("babad"));
    }
}