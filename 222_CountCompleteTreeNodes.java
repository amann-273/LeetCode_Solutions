class Solution
{
    int count = 0;
    public int countNodes(TreeNode root)
    {
        // Base case: if the tree is empty, return 0
        if(root == null) 
        {
            return 0;
        }
        
        countNodes(root.left); // Recursively count nodes in the left subtree
        countNodes(root.right); // Recursively count nodes in the right subtree
        
        count++; // Increment count for the current node
        return count;
    }
}
