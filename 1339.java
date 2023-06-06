class Solution {
    long prod = 0;
    public int maxProduct(TreeNode root) {
        List<Integer> sublist = new ArrayList<>();
        //using BFS to find tree sum
        long treesum = TreeSum(root);
        int ans = helper(root,treesum);
        return (int)(prod%(int)(Math.pow(10, 9) + 7));
    }
    public int helper(TreeNode root , long upSum)
    {
        if(root == null)return 0;
       int left=helper(root.left,upSum);
        int right=helper(root.right,upSum);
        long tempP=Math.abs(upSum-right)>Math.abs(upSum-left)?((upSum-left)*left):((upSum-right)*right);

        prod=Math.max(prod,tempP);
        return left+right+root.val;
    }
    public long TreeSum(TreeNode root)
    {
        if(root == null)return 0;
        long sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            sum += temp.val;
 
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return sum;
    }
}
