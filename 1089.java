class Solution {
    public void duplicateZeros(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int[] temp = new int[arr.length];

        while(start<end)
        {
            if(arr[start] == 0)
            {
                end--;
            }
            start++;
        }
        for(int i = arr.length-1; i>=0 && end >= 0; i-- , end--)
        {
          arr[i] = arr[end];
          if(arr[i] == 0 && start != end)
          {
            arr[i-1] = 0;
            i--;
          }
        }
    }
}
