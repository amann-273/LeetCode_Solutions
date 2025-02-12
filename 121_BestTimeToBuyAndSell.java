class Solution
{
    // This method finds the maximum profit that can be made by buying and selling once
    public int maxProfit(int[] arr)
    {
        // Initialize minPrice with the first element of the array (buying price)
        int minPrice = arr[0];
        
        // Initialize maxProfit to 0, as initially, no profit is made
        int maxProfit = 0;

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++)
        {
            // If the current price is less than the minPrice, update the minPrice
            if (arr[i] < minPrice)
            {
                minPrice = arr[i];
            }
            else
            {
                // Calculate the potential profit by selling at the current price
                int profit = arr[i] - minPrice;

                // Update maxProfit if the calculated profit is greater than the current maxProfit
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
