package com.example.leetcode.easy;

public class PalindromeNumber
{
    public boolean isPalindrome(int x) {
        // Base case 0 is a palindrome
        if(x == 0){
            return true;
        }

        // Negative numbers cannot be palindromes
        if(x < 0){
            return false;
        }

        // Create variables for our original number, our remainder and our eventual reverse integer
        int original = x;
        int remainder = 0;
        int reverse = 0;

        // Loop through the integer to reverse it
        while(x != 0){
            remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x /10;
        }

        // Check if our reverse integer is the same as our original
        if(original == reverse){
            return true;
        } else{
            return false;
        }
    }
}
