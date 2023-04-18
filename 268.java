class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for ( int i = 1; i<=n; i++)
        {
            sum = sum + i;
            sum = sum - nums[i-1];
        }
        return sum;
    }
}
