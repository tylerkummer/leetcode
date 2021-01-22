package com.example.leetcode.easy;

public class LongestCommonPrefix
{
    // Create a method to take in ann array of strings called strs
    public String longestCommonPrefix(String[] strs) {
        // Base case to check if the array length is 0
        if (strs.length == 0){
            // If it is return an empty string
            return "";
        }

        // Create a string variable called prefix that takes the value of the first element of strs
        String prefix = strs[0];

        // Create a for loop to go through the rest of the str array starting at the 2nd element
        for (int i = 1; i < strs.length; i++){

            // Create an index of the get the first occurrence of the specified characters in strs of i
            while (strs[i].indexOf(prefix) != 0){
                // Shrink the prefix down until the occurrence matches when the first instance of the longest prefix is used
                prefix = prefix.substring(0, prefix.length() -1);

                // Base case to return an empty array if prefix is empty.
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        // Return our prefix of the longest running numbers
        return prefix;
    }
}
