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
class BalancedBT {

    public int height(TreeNode root){
        
        if(root==null){
            return 0;
        }

        int leftheight=height(root.left);
        int rightheight=height(root.right);
        
        int height=Math.max(leftheight,rightheight)+1;
        return height;
    }
    public boolean isBalanced(TreeNode root) {
        

       if(root==null){
        return true;
       }

       return Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);

    }
}