class Solution // Kadane's Algorithm
{
    public int maxAscendingSum(int[] arr)
    {
        int max_sum = arr[0]; // Initialize max_sum with the first element at least one element is needed in the sum
        int sum = arr[0]; // Initialize sum with the first element to track ascending subarray
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > arr[i - 1]) // Checking if the current element is greater than the previous one
            {
                sum += arr[i]; // Add the current element to the ongoing ascending sum
            }
            else 
            {
                sum = arr[i]; // Reset sum to the current element, starting a new subarray
            }            
            max_sum = Math.max(max_sum, sum); // Updating max_sum comparing it with the current sum and the previously recorded max_sum which one is greater
        }
        return max_sum;
    }
}
