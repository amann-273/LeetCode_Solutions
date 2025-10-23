// Class containing the solution
class Solution 
{
    // Function to find the majority element in an array
    // Majority element = element that appears most frequently
    public int majorityElement(int[] nums) 
    {
        // Create a HashMap to store frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        
        // Loop through each number in the array
        for (int num : nums)
        {
            // Increment the frequency count of the current number
            // If number not present, default frequency = 0, then +1
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Variables to store maximum frequency and its corresponding element
        int max_freq = 0;
        int max_freq_element = 0;

        // Loop through all key–value pairs in the map
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            // If this element's frequency is greater than the current maximum
            if (entry.getValue() > max_freq)
            {
                // Update max frequency and store this element as the current majority
                max_freq = entry.getValue();
                max_freq_element = entry.getKey();
            }
        }

        // Return the element that has the highest frequency
        return max_freq_element;
    }
}
