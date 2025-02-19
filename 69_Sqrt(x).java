// Solution 1
class Solution 
{
    public int mySqrt(int x) 
    {
        // Handle base cases where x is 0 or 1
        if (x == 0 || x == 1) 
        {
            return x;
        }
        int low = 0, high = x, ans = 0;

        // Binary search loop to find the integer square root
        while (low <= high) 
        {
            // Calculate mid to avoid integer overflow
            int mid = low + (high - low) / 2;

            // If mid^2 is exactly x, return mid as the square root
            if ((long)mid*(long)mid == x) 
            {
                return mid;
            }

            // If mid^2 is less than x, mid is a potential answer
            // Store mid and move to the right to find a larger possible answer
            else if ((long)mid*(long)mid < x) 
            {
                ans = mid;
                low = mid + 1; // Move to the right half
            }

            // If mid^2 is greater than x, mid is too large, so search in the left half
            else 
            {
                high = mid - 1; // Move to the left half
            }
        }
        return ans;
    }
}

// Solution 2

class Solution 
{
    public int mySqrt(int x) 
    {
        // If x is 0, the square root is also 0
        if (x == 0) 
        {
            return 0;
        }

        // Calculate the square root using logarithms:
        // log(x) gives us ln(x), and multiplying by 0.5 computes ln(√x)
        // exp() then raises 'e' to the power of ln(√x), effectively giving us √x
        int res = (int) Math.round(Math.exp(0.5 * Math.log(x)));

        // Verify if res^2 is greater than x (floating-point precision issue)
        // If res * res is greater than x, return res - 1 to ensure truncation
        return (long) res * (long) res > x ? res - 1 : res;
    }
}

