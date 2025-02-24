class Solution
{
    // Helper function
    void traversal(TreeNode root, List<Integer> result) 
    {
        // Base case
        if (root == null) 
        {
            return;
        }

        // recursively traverse the left subtree
        traversal(root.left, result);

        // recursively traverse the right subtree
        traversal(root.right, result);

        // visit the current node (add its value to the result list)
        result.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        // create a list to store the result as return type is list
        List<Integer> result = new ArrayList<>();
        
        // calling traversal function recursively
        traversal(root, result);
        return result;
    }
}
