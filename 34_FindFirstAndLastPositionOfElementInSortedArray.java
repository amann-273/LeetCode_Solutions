class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        // Array to store the first and last position
        int[] arr = new int[2];

        // Edge case: if array is null or empty, return [-1, -1]
        if (nums == null || nums.length == 0) 
        {
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }

        //Count how many times target appears
        int count = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == target) 
            {
                count++;
            }
        }

        //If target is not found at all
        if (count == 0) 
        {
            arr[0] = -1;
            arr[1] = -1;
        } 
        else 
        {
          
            //Find first occurrence of target
            int first = -1;
            for (int i = 0; i < nums.length; i++) 
            {
                if (nums[i] == target) 
                {
                    first = i;
                    break;  // stop as soon as first match is found
                }
            }

            // Step 4: Find last occurrence of target
            int last = -1;
            for (int i = nums.length - 1; i >= 0; i--) 
            {
                if (nums[i] == target) 
                {
                    last = i;
                    break;  // stop as soon as last match is found (from end)
                }
            }

            //Store first and last indices in result array
            arr[0] = first;
            arr[1] = last;
        }

        //Return result array
        return arr;
    }
}
