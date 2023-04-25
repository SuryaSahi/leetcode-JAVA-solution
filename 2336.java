class SmallestInfiniteSet {
    HashSet<Integer> map;
    public SmallestInfiniteSet() {
        map = new HashSet<>();
    }
    
    public int popSmallest() {
        int i ,r = -1;
        for( i =1; i<1000;i++)
        {
            if(!map.contains(i))
            {
                r=i;
                break;
            }
        }
        map.add(i);
        return i;
    }
    
    public void addBack(int num) {
        map.remove(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
