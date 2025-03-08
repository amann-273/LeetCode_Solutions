class Solution 
{
    // Method to convert a Roman numeral string to an integer
    public int romanToInt(String s) 
    {
        int ans = 0, num = 0; // Initialize result (ans) and temporary value (num)
        // Iterate through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            // Assign numerical values based on Roman numeral characters
            switch (s.charAt(i)) 
            {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            // Check if the current numeral should be subtracted or added
            // If the current value is smaller than 1/4th of the total sum so far, subtract it
            if (4 * num < ans) 
                ans -= num;
            else 
                ans += num;
        }
        return ans;
    }
}
