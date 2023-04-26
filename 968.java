/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int C = 0;
    public int minCameraCover(TreeNode root) {
        if(root==null)return 0;
        int count = CameraCount(root);
        return count==-1?C+1:C;
    }
    public int CameraCount(TreeNode root)
    {

        if(root == null)return 1;
        if(root.left == null && root.right== null)return -1;
        int l = CameraCount(root.left);
        int r = CameraCount(root.right);
        if(l==-1 || r==-1)
        {
            C++;
            return 0;
        }
        if( l==0 || r==0)
        {
            return 1;
        }
        return -1;
    }
}
