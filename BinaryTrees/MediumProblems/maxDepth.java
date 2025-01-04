package BinaryTrees.MediumProblems;

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
public class maxDepth{
   // TC:O(N) SC:O(N) Recursion Method
   public int maxDepth(TreeNode root) {
   //     if(root == null) return 0;
   //     int lh = maxDepth(root.left);
   //     int rh = maxDepth(root.right);

   //     return 1+Math.max(lh,rh);
   // }

   // Level Order

   if(root == null) return 0;

   Queue<TreeNode> q = new LinkedList<>();

   q.offer(root);
   int level = 0;

   while(!q.isEmpty()){
       int size = q.size();
       for(int i=0;i<size;i++){
           TreeNode x = q.poll();
           if(x.left!=null) q.offer(x.left);
           if(x.right!=null) q.offer(x.right);
       }
       level++;
   }
   return level;
   } 

}
