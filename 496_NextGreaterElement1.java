// first approach through stack
class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length-1; i>=0; i--)
        {
            int num = nums2[i];

            while(!stack.isEmpty() && stack.peek()<=num)
            {
                stack.pop();
            }

            if(!stack.isEmpty())
            {
                nextGreater.put(num, stack.peek());
            }
            else
            {
                nextGreater.put(num, -1);
            }

            stack.push(num);
        }
        int result[] = new int[nums1.length];
        for(int i=0;i<result.length;i++)
        {
            result[i] = nextGreater.get(nums1[i]);
        }
        return result;
    }
}

// arrpoach through for loop
class Solution
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        List<Integer> ans = new ArrayList<>();  // vector<int> ans;

        for (int i = 0; i < nums1.length; i++) 
        {
            int max = -1;  // initially -1 if no greater element found
            for (int j = 0; j < nums2.length; j++) 
            {
                int index = j;  // same as C++ line (though not strictly needed)
                if (nums1[i] == nums2[j]) 
                {
                    // search for next greater element after this index
                    for (int k = j + 1; k < nums2.length; k++) 
                    {
                        if (nums2[k] > nums1[i]) 
                        {
                            max = nums2[k];
                            break;
                        }
                    }
                    break; // break outer nums2 loop once found nums1[i]
                }
            }
            ans.add(max);
        }

        // convert List<Integer> to int[]
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
