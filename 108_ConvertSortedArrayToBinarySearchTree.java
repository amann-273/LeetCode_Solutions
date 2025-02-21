class Solution 
{
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        // Checking if the array is null or has no elements
        if(nums==null || nums.length==0) 
        {
            return null;
        }
        // A separate function for construction of the tree passing the array and both of its ends
        return cons_BST(nums, 0, nums.length-1);
    }
    private TreeNode cons_BST(int[] arr, int left, int right)
    {
        // Base case for recursion, at this point of time no elements should be left to process during the execution
        if(left>right)
        {
            return null;
        }

        // Finding the middle element 
        int mid = left + (right-left)/2;

        // Keeping middle element as the root so that height is balanced and helps in deviding the tree into two subtrees
        TreeNode root = new TreeNode(arr[mid]);

        root.left = cons_BST(arr, left, mid-1); // Constructing the right subtree, recursively calling the function
        root.right = cons_BST(arr, mid+1, right); // Constructing the left subtree in the same manner

        return root;
    }
}
