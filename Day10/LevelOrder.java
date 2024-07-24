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
class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }

        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode>q=new ArrayDeque<>(Arrays.asList(root));
       
       while(!q.isEmpty()){
         List<Integer> currNode=new ArrayList<>();
         for(int i=q.size();i>0;i--){
            TreeNode node=q.poll();
            currNode.add(node.val);

            if(node.left!=null){
                q.offer(node.left);
            }

            if(node.right!=null){
                q.offer(node.right);
            }
         }

         list.add(currNode);

       }

       return list;
    }
}