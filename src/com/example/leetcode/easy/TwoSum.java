package com.example.leetcode.easy;

public class TwoSum
{
    // Create a method that will return an array of integers
    // Take in an array of integers called nums and an integer call target as arguments
    public int[] twoSum(int[] nums, int target)
    {
        // Create a for loop that will loop through the array nums
        for (int i = 0; i < nums.length; i++)
        {
            // Create another for loop that will loop through the array after nums[i]
            for (int j = i + 1; j < nums.length; j++)
            {
                // Check if the value of nums[j] will result in the target number minus the value of nums[i]
                if (nums[j] == target - nums[i])
                {
                    // Return a new array of integers that is composed of the values i and j.
                    return new int[] { i, j };
                }
            }
        }

        // If we exit out of the for loop then none of the sums matched our target.
        // Return a message that displays that no matches were found.
        throw new IllegalArgumentException("No Match");

    }
}
