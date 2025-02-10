class Solution
{
    
    // Method to clear digits from the input string
    public String clearDigits(String s)
    {
        
        // StringBuilder to store the result (characters after processing)
        StringBuilder sb = new StringBuilder();
        
        // Loop through the entire input string
        for (int i = 0; i < s.length(); i++)
        {
            
            // Check if the current character is a digit (between '0' and '9')
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                
                // If the character is a digit, remove the last character from the StringBuilder (delete previous non-digit character)
                // This simulates the effect of "clearing" the digit and its preceding character.
                sb.deleteCharAt(sb.length() - 1);
            } 
            else
            {
                // If the character is not a digit, add it to the StringBuilder
                sb.append(s.charAt(i));
            }
        }
        
        // Return the modified string after processing all characters
        return sb.toString();
    }
}
