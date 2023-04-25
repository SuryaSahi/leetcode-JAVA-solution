class Solution {
    Integer[] dp = new Integer[46];
    public int climbStairs(int n) {
    if(n <= 2)
    {
    dp[n] = n;
    return n;
    }
    if(dp[n] != null)
    return dp[n];
    int res = climbStairs(n-1) + climbStairs(n-2);
    if(dp[n]==null)
    dp[n] = res;
    return res;
} 
}

/* if(n=1)return 1;
if(n=2)return 2;
return Climb(n-1) + Climb(n-2) */ 
