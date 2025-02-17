class Solution 
{
    public TreeNode searchBST(TreeNode root, int val) 
    {
        // Base case: If the node is null or matches the value, return it
        if (root == null || root.val == val) 
        {
            return root;
        }

        // If the value is greater, search in the right subtree
        if (root.val < val) 
        {
            return searchBST(root.right, val);
        }
        
        // Otherwise, search in the left subtree
        return searchBST(root.left, val);
    }
}
