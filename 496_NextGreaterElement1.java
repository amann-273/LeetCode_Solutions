// Brute Force Approach - Using nested for loops
// Time Complexity: O(n1 * n2)  → for each element in nums1, we scan nums2
// Space Complexity: O(1) extra (ignoring output list)
class Solution
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        // List to temporarily store answers (like vector<int> in C++)
        List<Integer> ans = new ArrayList<>();

        // Loop through each element of nums1
        for (int i = 0; i < nums1.length; i++) 
        {
            int max = -1;  // default value, in case no greater element found

            // Loop through nums2 to find the position of nums1[i]
            for (int j = 0; j < nums2.length; j++) 
            {
                // If we find nums1[i] in nums2
                if (nums1[i] == nums2[j]) 
                {
                    // Start searching for the next greater element after index j
                    for (int k = j + 1; k < nums2.length; k++) 
                    {
                        // If any element is greater, store it in max and break
                        if (nums2[k] > nums1[i]) 
                        {
                            max = nums2[k];
                            break; // exit inner loop as soon as next greater found
                        }
                    }

                    // Once we found nums1[i] position in nums2, no need to continue searching
                    break;
                }
            }

            // Add the found (or -1 if not found) value into answer list
            ans.add(max);
        }

        // Convert List<Integer> to int[] before returning (LeetCode requires int[])
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) 
        {
            result[i] = ans.get(i);
        }

        // Return final result array
        return result;
    }
}


// Approach: Using Stack and HashMap for efficient O(n) solution
class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        // Map to store each number's next greater element in nums2
        Map<Integer, Integer> nextGreater = new HashMap<>();

        // Stack to keep track of elements for which next greater is not yet found
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 from right to left
        for(int i = nums2.length - 1; i >= 0; i--)
        {
            int num = nums2[i];  // Current element

            // Pop all elements smaller or equal to current element
            // because they cannot be the next greater for any upcoming element
            while(!stack.isEmpty() && stack.peek() <= num)
            {
                stack.pop();
            }

            // If stack is not empty, top element is the next greater element
            if(!stack.isEmpty())
            {
                nextGreater.put(num, stack.peek());
            }
            else
            {
                // If stack is empty, no greater element exists
                nextGreater.put(num, -1);
            }

            // Push current element into stack for future comparisons
            stack.push(num);
        }

        // Prepare result array for nums1
        int result[] = new int[nums1.length];

        // For each element in nums1, get its next greater from the map
        for(int i = 0; i < result.length; i++)
        {
            result[i] = nextGreater.get(nums1[i]);
        }

        // Return the result array
        return result;
    }
}
