class Solution {
    public void moveZeroes(int[] nums) {
        //Applied Brute force but time limit exceeded
        int n =nums.length;
        int zero = 0;
        int cha =0;
        for(int i =0;i<n;i++){
            while(cha<n && nums[cha]==0){
                cha++;
                zero++;
            }
            if(cha<n)
            nums[i] = nums[cha];
            cha++;
        }

        for(int i =n-zero;i<n;i++){
            nums[i]=0;
        }
    }
}
