class Solution 
{
    // Method to remove duplicate values from a sorted linked list
    public ListNode deleteDuplicates(ListNode head) 
    {
        // Initialize a temporary pointer to traverse the list
        ListNode temp = head;

        // If the linked list is empty, return null
        if (temp == null) 
        {
            return null;
        }

        // Traverse the linked list until the last node
        while (temp.next != null) 
        {
            // Check if the current node's value is the same as the next node's value
            if (temp.val == temp.next.val) 
            {
                // Skip the next node by making 'next' point to the node after the duplicate
                temp.next = temp.next.next;
            }
            else 
            {
                // Move to the next node only if there is no duplicate
                temp = temp.next;
            }
        }
        
        // Return the modified linked list with duplicates removed
        return head;
    }
}
