package zhonghcc.P0500_KeyboardRow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhong on 2017/2/9.
 */
public class SolutionTest {

    @Test
    public void testFindWords() throws Exception {

        Solution s = new Solution();
        String[] input = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] right = new String[]{"Alaska", "Dad"};
        String[] result = s.findWords(input);
        Assert.assertArrayEquals(result,right);

        input = new String[]{"werqoiertj","eryuwqoiuer","asdfhaksdfksdf","cvzbdxvcmc"};
        right = new String[]{"eryuwqoiuer","asdfhaksdfksdf"};
        result = s.findWords(input);
        Assert.assertArrayEquals(result,right);
    }
}