package com.example.leetcode.easy;

public class TwoSum
{
    public int[] twoSum(int[] nums, int target) {
        // Create an index of 0
        int i = 0;
        // Create a for loop that goes through the next element
        for(int j = i + 1; j < nums.length; j++){
            // Check if the element of j is target subtracted from index i
            if(nums[j] == target - nums[i]){
                // If it is then return a new array containing i and j
                return new int[] {i, j};
            } else{
                // If not then cycle to the next element of i
                i += 1;
            }
        }
        // Return this message if nothing passes, will allow user to return a string instead of an array of nums
        throw new IllegalArgumentException("No Match");
    }
}

