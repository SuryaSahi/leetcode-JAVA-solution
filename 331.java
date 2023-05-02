class Solution {
    public boolean isValidSerialization(String preorder) {
        int vacancy = 1;
        if(preorder.charAt(0) == '#' && preorder.length() == 1)
        return true;
        if(preorder.charAt(0) == '#')
        return false;
        //removing commas
        String[] traverse= preorder.split(",");
        for(int i = 0; i<traverse.length; i++)
        {
            vacancy -= 1;
            //at each iteration -1 is added
            if(vacancy < 0)
            {
                return false;
            }
            if(traverse[i].charAt(0) != '#')
            {
                //if node present add +2
                vacancy += 2;
            }
            
        }
        if(vacancy == 0)
        {
            return true;
            // total valid vacancy is complete
        }
        else
        {
            return false;
        }
    }
}
