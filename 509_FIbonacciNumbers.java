class Solution 
{
    public int fib(int n) 
    {
        // Base case 1: when n = 0, Fibonacci is 0
        if(n == 0) return 0;

        // Base case 2: when n = 1, Fibonacci is 1
        if(n == 1) return 1;

        // Recursive case:
        // F(n) = F(n-1) + F(n-2)
        // This breaks down the problem into smaller subproblems
        return fib(n - 1) + fib(n - 2);
    }
}
