package com.example.leetcode.easy;

public class RemoveElement
{
    public int removeElement(int[] nums, int val) {
        // Base case to check if the array is empty
        if(nums.length == 0){
            return 0;
        }

        // Create int to cycle through nums
        int i = 0;
        // Create another int to cycle through nums
        for(int j = 0; j < nums.length; j++){
            // Check if nums of j does not equal val
            if(nums[j] != val){
                // Replace the value with nums of i with nums of j for our new array
                nums[i] = nums[j];
                // Increase i to continue the cycle
                i++;
            }
        }
        // Return new array
        return i;
    }

}
