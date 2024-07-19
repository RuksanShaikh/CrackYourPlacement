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
class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }

        boolean ans=false;
        int sum=targetSum-root.val;

        if(sum==0 && root.left==null &&root.right==null){
            return ans=true;
        }

        if(root.left!=null)
        ans=ans||hasPathSum(root.left,sum);

        if(root.right!=null)
        ans=ans||hasPathSum(root.right,sum);


    return ans;
        


    }
}