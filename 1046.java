class Solution {
    public int lastStoneWeight(int[] stones) {
        //creating a heap to store elements in descending order
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0 ; i < stones.length; i ++){
            q.add(stones[i]);
        }
        while(q.size() > 1){
            int x = q.poll();
            int y = q.poll();
            if(x == y){
                continue;
            }else{
                q.add(Math.abs(y - x));
            }
        }
        if(q.size() == 1){
            return q.poll();
        }
        return 0;
    }
}
