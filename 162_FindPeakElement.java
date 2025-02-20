class Solution
{
    public int findPeakElement(int[] nums)
    {
        // Initializing pointers for binary search: 'low' is the starting index, 'high' is the last index of the array
        int low = 0;
        int high = nums.length - 1;
        
        // While loop to perform binary search
        while (low < high) 
        {
            // Calculate the middle index to divide the array
            int mid = (low + high) / 2;
            
            // If the middle element is greater than the next element, it indicates that the peak element lies to the left
            // or is at the 'mid' itself.
            if (nums[mid] > nums[mid + 1]) 
            {
                // Move the 'high' pointer to 'mid' as peak is on the left side
                high = mid;
            } 
            else 
            {
                // If the middle element is smaller than the next element, the peak lies to the right
                // Move the 'low' pointer to 'mid + 1' to explore the right half
                low = mid + 1;
            }
        }
        
        // At the end of the loop, 'low' will point to the peak element's index, so return it
        return low;
    }
}
