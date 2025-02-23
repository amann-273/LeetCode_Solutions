//Solution 1
class Solution
{
    public String removeOccurrences(String s, String part)
    {
        // Checks and iterates throughout the string whether the substring is present in the string or not
        while(s.contains(part))
        {
            // Replaces the first occurrence of 'part' in the string with an empty string
            s = s.replaceFirst(part,"");
        }
        return s;
    }
}

// The above solutuon takes time of 9 ms a more optimised solution is given below.

//Solution 2
class Solution
{
    public String removeOccurrences(String s, String part)
    {
        // Checking whether the substring is present or not
        while(s.contains(part))
        {
            // Records index of the part and this is continued till we have no part left
            int part_index = s.indexOf(part);
            // Adding the string from 0th index uptil the part substring is found and then concatenating it with the remaining string.
            s = s.substring(0,part_index) + s.substring(part_index + part.length());
        }
        return s;
    }
}
