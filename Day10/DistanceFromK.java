/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class DistanceFromK {
      List<TreeNode> path = null;
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        path=new ArrayList<>();
       findPath(root,target);
       List<Integer> result=new ArrayList<>();

       for(int i=0;i<path.size();i++){
        findKDistance(path.get(i),k-i,result,i==0?null:path.get(i-1));
       }
       return result;
        
    }

    public void findKDistance(TreeNode node,int dist,List<Integer> result,TreeNode b){

        if(dist<0 || node==null||(b!=null && node==b)){
            return ;
        }

        if(dist==0){
            result.add(node.val);
        }

        findKDistance(node.left,dist-1,result,b);
        findKDistance(node.right,dist-1,result,b);
    }

    public boolean findPath(TreeNode node,TreeNode target){
        if(node==null){
            return false;
        }
        if(node==target||findPath(node.left,target)||findPath(node.right,target)){
           path.add(node);
            return true;
        }
        return false;
    }
}