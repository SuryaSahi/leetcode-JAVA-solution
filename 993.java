class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int sum = 0;
        while(!q.isEmpty())
        {
            
            int size = q.size();
            for(int i = 0; i<size; i++)
            {
                TreeNode curr = q.poll();
            if((curr.left != null && curr.right != null) && (curr.left.val == x && curr.right.val == y || curr.left.val == y && curr.right.val == x))
            return false;
                if(curr.val == x || curr.val == y)
                sum +=1;
                if(curr.left != null)
                {
                    q.offer(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
            if(sum == 2)
            return true;
            sum = 0;
        }
        return false;
    }
}
