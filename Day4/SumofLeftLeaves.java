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
class SumofLeftLeaves{

    boolean isLeaf(TreeNode root) 
    {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return true;
        return false;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }

        int sum=0;
        if(root!=null){

         if(isLeaf(root.left))
            sum+=root.left.val;
         else
            sum+=sumOfLeftLeaves(root.left);

        sum+=sumOfLeftLeaves(root.right);    

        }


        return sum;


     

        
        
    }
}