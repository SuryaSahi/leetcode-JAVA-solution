class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
       Arrays.sort(arr);
        int d = 0;
        d = arr[1] - arr[0];
        boolean flag = false;
        if(arr.length <= 2)return true;
        for( int i = 2; i<arr.length; i++)
        {
            int check = arr[i] - arr[i-1];
            if(check == d)
            {
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}
