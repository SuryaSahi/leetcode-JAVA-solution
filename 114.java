// Using Morris Traversal

class Solution {
   
    public void flatten(TreeNode root) {
        if(root ==  null)return;

        while (root != null)
        {
            if(root.left != null){
            TreeNode leftroot = root.left;
            TreeNode current = leftroot;
            while(current.right != null )
            {
                current = current.right;
            }
            current.right = root.right;
            root.left = null;
            root.right = leftroot;
            }
           root = root.right;
        }

    }
}
