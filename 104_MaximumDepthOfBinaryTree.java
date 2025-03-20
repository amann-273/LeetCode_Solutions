class Solution
{
    public int maxDepth(TreeNode root) 
    {
        // Base case: If the tree is empty (root is null), depth is 0
        if (root == null) 
        {
            return 0;
        }
        
        // Recursively compute the depth of the left subtree
        int leftDepth = maxDepth(root.left);
        
        // Recursively compute the depth of the right subtree
        int rightDepth = maxDepth(root.right);
        
        // The depth of the tree is the maximum depth of either subtree + 1 (for the root)
        return 1 + Math.max(leftDepth, rightDepth); 
    }
}
