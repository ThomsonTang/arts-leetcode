package twosum;

/**
 * Solution 1: 暴力法
 * 
 * @author Thomson Tang
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("no two sum numbers for target.");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 8, 11, 15, 7 };
        int target = 9;

        int[] indices = twoSum(nums, target);

        System.out.println("indices: " + indices[0] + ", " + indices[1]);
    }
}