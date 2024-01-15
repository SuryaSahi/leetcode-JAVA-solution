class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        //we will check no of times a player has a lost a match
        //first getting all the losers
        HashMap<Integer , Integer> loser = new HashMap<>();
        for(int i = 0; i<matches.length; i++){
          loser.put(matches[i][1] , loser.getOrDefault(matches[i][1] , 0) + 1);
        }
      
        //Now getting all winners with no loss
        Set<Integer> winner = new HashSet<>();
        for(int[] match : matches){
          if(!loser.containsKey(match[0]))winner.add(match[0]);
        }
      
        //Getting all the one loss 
        List<Integer> OneLoss = new ArrayList<>();
        for(int losers : loser.keySet()){
          if(loser.get(losers) == 1)OneLoss.add(losers);
        }

        List<Integer> winnerlist = new ArrayList<>(winner);
        Collections.sort(OneLoss);
        Collections.sort(winnerlist);

        List<List<Integer>> ans = new ArrayList<>();

        ans.add(winnerlist);
        ans.add(OneLoss);
        return ans;
    }
}
