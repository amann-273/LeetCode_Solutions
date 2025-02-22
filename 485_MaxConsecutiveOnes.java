import java.util.*; //solved through sliding window
class Solution
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int start = 0;
        int max_cons = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                start = i+1; // if we found zero then we will start the loop from next index in search of another one
            }
            else
            {
                max_cons = Math.max(max_cons,i-start+1); // we fill find the maximum number of one's encountered whether it was during the starting or it was found after a zero and then returning the maximum value between the two
            }
        }
        return max_cons;
    }
}
