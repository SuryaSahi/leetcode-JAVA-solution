class Solution {
    public int lengthOfLIS(int[] nums) {
        int [] ans = new int[nums.length];
        int size = 0;
        for(int i: nums)
        {
            int start = 0 , last = size;
            while(start < last)
            {
                int mid = start + (last - start)/2;
                if( ans[mid] < i)
                {
                    start = mid+1;
                }
                else
                {
                    last = mid;
                }
            }
            ans[start] = i;
            if(start == size)
            ++size;
        }
        return size;
    }
}
