class Solution 
{
    public boolean check(int[] nums) 
    {
        int deviations = 0;
        int len = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(i < len-1 && nums[i] > nums[i+1]) // deviation will occur when a non incresing trend comes while traversing
            {
                deviations++;
            }
            else if(i == len-1 && nums[len-1] > nums[0]) // checking the last element with the first element 
            {
                deviations++;
            }
        }    
        if(deviations > 1) // sorted + rotated arrya will have only one deviation 
        {
            return false;
        }
        return true;
    }
}
