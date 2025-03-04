class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        // Iterate through the haystack with a sliding window of size equal to needle length
        for(int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) 
        {
            // Extract the substring from haystack with the same length as needle
            if(haystack.substring(i, j).equals(needle))
            {
                // If the extracted substring matches the needle, return the starting index
                return i;
            }
        }
        return -1;
    }
}
