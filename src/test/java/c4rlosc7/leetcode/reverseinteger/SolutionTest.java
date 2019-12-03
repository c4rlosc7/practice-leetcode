package c4rlosc7.leetcode.reverseinteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void reverseTest1() {
        Solution solve = new Solution();

        int expected = 123;

        assertEquals(expected, solve.reverse(123));
    }
}