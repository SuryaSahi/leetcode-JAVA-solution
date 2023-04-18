class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int MaxOne = 0;
        int ResOne = 0;
        for ( int i = 0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            {
                ResOne = ResOne + 1;
                MaxOne = Math.max(MaxOne , ResOne);
            }
            else 
            {
                ResOne = 0;
            }
        }
        return MaxOne;
    }
}
