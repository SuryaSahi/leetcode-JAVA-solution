class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int count = 0 , max = 1;
        //add a list to the answer
        ans.add(new ArrayList<>());
        ans.get(0).add(nums[0]);
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++; // count will check if the frequency of number increase the no of inner list 
                if(count < max){
                    ans.get(count).add(nums[i]); // if its within the no of list add the nums[i] in the freq no of list
                }
                else{
                    //if count is more than max no of list then increase the no of list and the nums[i] in that new inner list
                    ans.add(new ArrayList<>());
                    max++;
                    ans.get(count).add(nums[i]);
                }
            }
            else{
                //if its the first occurence the add in the first list
                count = 0;
                ans.get(count).add(nums[i]);
            }
        }
        return ans;
    }
}
