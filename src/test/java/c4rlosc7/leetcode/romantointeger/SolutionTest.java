package c4rlosc7.leetcode.romantointeger;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void example1Test() {
        // Input: "III", Output: 3
        Solution solve = new Solution();
        int expected = 3;
        assertEquals(expected, solve.romanToInt("III"));
    }

    @Test
    public void example2Test() {
        // Input: "IV", Output: 4
        Solution solve = new Solution();
        int expected = 4;
        assertEquals(expected, solve.romanToInt("IV"));
    }

    @Test
    public void example3Test() {
        // Input: "IX", Output: 9
        Solution solve = new Solution();
        int expected = 9;
        assertEquals(expected, solve.romanToInt("IX"));
    }

    @Test
    public void example4Test() {
        // Input: "LVIII", Output: 58, Explanation: L = 50, V= 5, III = 3.
        Solution solve = new Solution();
        int expected = 58;
        assertEquals(expected, solve.romanToInt("LVIII"));
    }

    @Test
    public void example5Test() {
        // Input: "MCMXCIV", Output: 1994, Explanation: M = 1000, CM = 900, XC = 90 and IV = 4
        Solution solve = new Solution();
        int expected = 1994;
        assertEquals(expected, solve.romanToInt("MCMXCIV"));
    }

}