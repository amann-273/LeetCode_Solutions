class Solution 
{
    public boolean isPalindrome(int x) 
    {
        // Store the original number for later comparison
        int org = x;  
        int rev = 0;

        // Negative numbers cannot be palindromes 
        // (because of the '-' sign at the start)
        if (x < 0) 
        {
            return false;
        }

        // Reverse the number digit by digit
        while (x != 0) 
        {
            int digit = x % 10;       // Extract the last digit
            rev = rev * 10 + digit;   // Append digit to the reversed number
            x = x / 10;               // Remove the last digit from x
        }

        // If reversed number equals the original, it's a palindrome
        return (org == rev);
    }
}
