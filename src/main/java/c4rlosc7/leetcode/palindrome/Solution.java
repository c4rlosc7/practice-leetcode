package c4rlosc7.leetcode.palindrome;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String string = Integer.toString(x);
        int remainder, reverse = 0;
        int tmp = x;
        while (tmp != 0) {
            remainder = tmp % 10;
            reverse = reverse * 10 + remainder;
            tmp = tmp / 10;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.isPalindrome(-121));
    }


}
