class Solution  
{  
    public void moveZeroes(int[] nums)  
    {  
        int start = 0; // Pointer to track the position for non-zero elements

        // Iterate through the array
        for(int i = 0; i < nums.length; i++)  
        {  
            if(nums[i] != 0)  // Check if the current element is non-zero
            {  
                nums[start] = nums[i]; // Move non-zero element to the correct position
                start++; // Increment the position pointer
            }  
        }  

        // Fill the remaining positions with zeros
        while(start < nums.length)  
        {  
            nums[start] = 0; // Set remaining positions to zero
            start++; // Move to the next position
        }  
    }  
}
