class Solution {
    public int minMoves(int[] nums, int k) {
        List<Integer> index_list = new ArrayList<>();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            index_list.add(i);
        }
        int prefixsum[] =  new int[index_list.size()];
        for(int i = 0; i<index_list.size(); i++)
        {
            prefixsum[i] +=index_list.get(i) + (i == 0 ? 0 : prefixsum[i-1]); 
        }
        
        int left  = 0 , right = k - 1;
        while(right < index_list.size())
        {
            if (k % 2 == 1) {
				int mid = left + (k + 1) / 2 - 1;
				int rad = mid - left;
				int res = (prefixsum[right] - prefixsum[mid])
						- ((mid == 0 ? 0 : prefixsum[mid - 1]) - (left == 0 ? 0 : prefixsum[left - 1])) - rad * (rad + 1);
				ans = Math.min(ans, res);
			} else {
				int mid = left + (k + 1) / 2 - 1;
				int rad = mid - left;
				int res = (prefixsum[right] - prefixsum[mid])
						- ((mid == 0 ? 0 : prefixsum[mid - 1]) - (left == 0 ? 0 : prefixsum[left - 1]))
						- index_list.get(mid) - rad * (rad + 1) - (rad + 1);
				ans = Math.min(ans, res);
        }
        left++;
        right++;
        }
        return ans;
    }
}
