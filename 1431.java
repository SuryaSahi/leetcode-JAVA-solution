class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for ( int i = 0; i<candies.length; i++)
        {
            if(candies[i] > max)
            {
                max = candies[i];
            }
        }
        List<Boolean> l = new ArrayList<>();
        // changing the values to boolean string
        for ( int candy : candies)
        {
            if(candy + extraCandies >= max)
            {
                l.add(true);
            }
            else
            {
                l.add(false);
            }
        }
        return l;
    }
}
