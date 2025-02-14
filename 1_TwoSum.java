//Solution 1
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // Iterate through the array using the first pointer
        for(int i = 0; i < nums.length; i++)
        {
            // Iterate through the remaining elements using the second pointer
            for(int j = i + 1; j < nums.length; j++)
            {
                // Check if the sum of the two elements equals the target
                if(target == nums[i] + nums[j])
                {
                    // Return the indices of the two numbers
                    return new int[] {i, j};
                }
            }
        }
      return new int[] {};     
    }
}

// The above solution is an easy approach but takes time of 44ms
// A more optimised approach using HashMap is given below

// Solution 2
import java.util.*;
class Solution
{
    public int[] twoSum(int[] nums, int target) 
    {
        // Create a HashMap to store the elements and their indices
        Map<Integer, Integer> mp = new HashMap<>();

        // Iterate through the array
        for(int i = 0; i < nums.length; i++)
        {
            // Calculate the required number to reach the target
            int difference = target - nums[i];

            // Check if the difference already exists in the map
            if(mp.containsKey(difference))
            {
                // Return the indices of the two numbers
                return new int[]{mp.get(difference), i};
            }

            // Store the current number and its index in the map
            mp.put(nums[i], i);
        }
        return null;
    }
}
