package c4rlosc7.leetcode.reverseinteger;

/*
* Given a 32-bit signed integer, reverse digits of an integer.
*
* Input: 123
* Output: 321
*
* Input: -123
* Output: -321
*
* Input: 120
* Output: 21
*
* */

public class Solution {

    public String getNumberToString(int x) {
        String string = Integer.toString(x);
        String[] parts = string.split("-");
        String numPart = parts[1];
        return numPart;
    }

    public int reverse(int x) {
        String numberAsString;
        Boolean isNegative = false;
        if (x < 0) {
            numberAsString = getNumberToString(x);
            isNegative = true;
        } else {
            numberAsString = Integer.toString(x);
        }
        String response = "";
        for (int i = numberAsString.length()-1; i >= 0; i--) {
            if (isNegative) {
                response += "-";
                isNegative = false;
            }
            if (numberAsString.charAt(i) == 0 && i == numberAsString.length()-1) {
                break;
            }
            response += numberAsString.charAt(i);
        }
        try {
            return Integer.parseInt(response);
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.reverse(123));
        System.out.println(solve.reverse(-123));
        System.out.println(solve.reverse(120));
    }

}
