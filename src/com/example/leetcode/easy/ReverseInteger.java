package com.example.leetcode.easy;

public class ReverseInteger
{
    // Create a class that will return an integer and takes in x
    public int reverse(int x) {
        // Create a variable for reverse
        int rev = 0;

        // Make sure x does not contain a 0 while we loop through
        while (x != 0) {

            // Create a new variable for pop that is at the end variable
            int pop = x % 10;

            // Divide by 10 to go to the next integer
            x /= 10;

            // Make sure that rev is not outside of the Java scope
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

            // Have rev multiplied by 10 for the first integer and add pop for the following integers
            rev = rev * 10 + pop;
        }

        // Return our reverse integer
        return rev;
    }
}
