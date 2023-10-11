class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        result[0] =first(nums ,nums.length, target);
        result[1] = last(nums ,nums.length, target);
        return result;
    }
    public int first(int[] nums ,int n, int target){
      int ans = -1;
      int s = 0;
      int e = n - 1; 
      int mid = s + (e-s)/2;
      while(s <= e){
        if(nums[mid] == target){
          ans = mid;
          e = mid-1;
        }
        else if(nums[mid] > target){
          e = mid - 1;
        }
        else {
          s = mid + 1;
        }
        mid = s + (e-s)/2;
      }
      return ans;
    }
    public int last(int[] nums ,int n, int target){
      int ans = -1;
      int s = 0;
      int e = n - 1; 
      int mid = s + (e-s)/2;
      while(s <= e){
        if(nums[mid] == target){
          ans = mid;
          s = mid+1;
        }
        else if(nums[mid] > target){
          e = mid - 1;
        }
        else {
          s = mid + 1;
        }
        mid = s + (e-s)/2;
      }
      return ans;
    }
}
