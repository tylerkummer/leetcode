package com.example.leetcode.easy;

public class TwoSum
{
    public int[] twoSum(int[] nums, int target) {
        // Create a for loop to cycle through the nums array
        for (int i = 0; i < nums.length; i++) {
            // Create a second for loop to cycle through the next element of the nums array
            for (int j = i + 1; j < nums.length; j++) {
                // Check if nums of j is the same as target minus nums of i
                if (nums[j] == target - nums[i]) {
                    // If that is the case then return a new array of i and j
                    return new int[] { i, j };
                }
            }
        }

        // Else return a message saying a solution could not be found.
        throw new IllegalArgumentException("No two sum solution");
    }
}

