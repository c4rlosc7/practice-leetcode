package c4rlosc7.leetcode.twosum;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9
 * return [0,1]
 *
 * [3,2,4],6
 *
 * */

public class Solution {

    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        //int[] nums = {2, 7, 11, 15};
        int[] nums = {3,2,4};
        //int target = 9;
        int target = 6;
        int[] result;
        result = solve.twoSum(nums, target);
        System.out.println("Solve: " + result[0] + result[1]);
    }

}
