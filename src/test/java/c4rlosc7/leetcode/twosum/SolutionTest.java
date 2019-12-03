package c4rlosc7.leetcode.twosum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void twoSumTest() {

        Solution solve = new Solution();
        int[] nums = {3, 2, 4};

        int[] expected = {1, 2};

        assertArrayEquals(solve.twoSum(nums, 6), expected);

    }
}