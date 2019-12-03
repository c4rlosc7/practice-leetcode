package c4rlosc7.leetcode.romantointeger;

/*
* Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
*
* Symbol       Value
* I             1
* V             5
* X             10
* L             50
* C             100
* D             500
* M             1000
*
* Explanation: L = 50, V= 5, III = 3.
* Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*
* */

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public int romanToInt(String romanNumber) {

        int length = romanNumber.length();
        char[] symbols = romanNumber.toCharArray();
        int convertedSymbols = 0;

        HashMap<Character, Integer> symbolValues = new HashMap<Character, Integer>();
        symbolValues.put('I', 1);
        symbolValues.put('V', 5);
        symbolValues.put('X', 10);
        symbolValues.put('L', 50);
        symbolValues.put('C', 100);
        symbolValues.put('D', 500);
        symbolValues.put('M', 1000);

        for (int x = 0; x < length; x++) {
            System.out.println(convertedSymbols);

            if ( x == length-1 || symbolValues.get(symbols[x]) >= symbolValues.get(symbols[x+1])) {
                convertedSymbols += symbolValues.get(symbols[x]);
            } else {
                convertedSymbols += (symbolValues.get(symbols[x+1]) - symbolValues.get(symbols[x]));
                x++;
            }
        }

        return convertedSymbols;
    }

    public static void main(String[] args) {
        Solution solve = new Solution(); // III, IV, IX, LVIII, MCMXCIV
        System.out.println("Result: " + solve.romanToInt("MCMXCIV"));
    }
}
