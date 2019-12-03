package c4rlosc7.leetcode.palindrome;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindromeTest(){
        Solution solve = new Solution();

        assertTrue(solve.isPalindrome(123));
    }

}