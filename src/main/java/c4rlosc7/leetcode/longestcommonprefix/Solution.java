package c4rlosc7.leetcode.longestcommonprefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        String longestCommonPrefix = new String();

        if (strs.length == 0) {
            longestCommonPrefix = "";
        }
        if (strs.length == 1) {
            longestCommonPrefix = strs[0];
        }

        for (int index = 0; index < strs.length; index++) {
            commonPrefix(strs[index], strs[index+1]);
        }

        return longestCommonPrefix;
    }

    public void commonPrefix(String str1, String str2) {
        //char[] symbols = str1.toCharArray();
    }

    public static void main(String[] args) {

    }
}
