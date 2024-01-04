class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
        }
        int ans = 0;
        for(int i : map.keySet()){
            int n = map.get(i);
            int div = n / 3;
            int mod = n % 3;
            ans += div; // operations for pairs
            if(mod == 1){
                //check if pair is possible or not
                if(div == 0){
                    return -1;
                }
                // element from remainder to form pair
                ans += 1;
            }
            //remainder pair is possible
            else if(mod == 2)ans += 1;
        }
        return ans;
    }
}
