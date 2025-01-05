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
class maxPathSum {
    int max  = Integer.MIN_VALUE;
    int maxPath(TreeNode root){
        if(root==null) return 0;

        int lh = Math.max(0,maxPath(root.left));
        int rh = Math.max(0,maxPath(root.right));

         max = Math.max(max,(root.val+lh+rh));

        return root.val+Math.max(lh,rh);
    }
    public int maxPathSum(TreeNode root) {

        maxPath(root);
        return max;
        
    }
}
