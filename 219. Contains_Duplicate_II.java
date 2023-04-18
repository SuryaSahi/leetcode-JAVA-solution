class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map =  new HashMap<>();
         if ( k == 0) return false;

         for (int i = 0; i<nums.length; i++)
         {
             if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
             {
                 return true;
             }
             else
             {
                 map.put(nums[i],i);
             }
         }
         return false;
    }
}
