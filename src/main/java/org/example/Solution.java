package org.example;

public class Solution {
    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else if (nums.length == 3) {
            return Math.max(nums[0] + nums[2], nums[1]);
        }

        nums[2] += nums[0];
        int result = Math.max(nums[1], nums[2]);
        for (int i = 3; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 2], nums[i - 3]);
            result = Math.max(result, nums[i]);
        }
        return result;
    }
}
