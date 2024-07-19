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
class BST {

    public TreeNode insert(int nums[],int left,int right){
      if (left > right)
      return null;
     int mid = (left + right) / 2;
    return new TreeNode(nums[mid], insert(nums, left, mid-1), insert(nums, mid+ 1, right));
    }

    public TreeNode sortedArrayToBST(int[] nums) { 
        
        return  insert(nums,0,nums.length-1);
    }
}