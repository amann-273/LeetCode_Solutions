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

        // Visit the current node (add its value to the result list)
        result.add(root.val);

        // traversing the left subtree recursively
        traversal(root.left, result);

        // traversing the right subtree recursively
        traversal(root.right, result);
    }
  
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        // Create a list to store the result as return type is also list
        List<Integer> result = new ArrayList<>();

        // calling the traversal function recursively
        traversal(root, result);
        return result;
    }
}
