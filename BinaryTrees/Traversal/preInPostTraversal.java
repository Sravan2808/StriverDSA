/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

 import java.util.ArrayList;
 import java.util.List;
 public class preInPostTraversal {
     public static List<List<Integer>> getTreeTraversal(TreeNode root) {
         // Write your code here.
 
         List<List<Integer>> res = new ArrayList<>();
         res.add(inOrder(root,new ArrayList<>()));
         res.add(preOrder(root,new ArrayList<>()));
         res.add(postOrder(root,new ArrayList<>()));
         return res; 
     }
     public static List<Integer> inOrder(TreeNode root,ArrayList<Integer> li){
         if(root == null) return li;
         inOrder(root.left,li);
         li.add(root.data);
         inOrder(root.right,li);
         return li;
     }
     public static List<Integer> postOrder(TreeNode root,ArrayList<Integer> li){
         if(root == null) return li;
         postOrder(root.left,li);
         postOrder(root.right,li);
         li.add(root.data);
         return li;
     }
     public static List<Integer> preOrder(TreeNode root,ArrayList<Integer> li){
         if(root == null) return li;
         li.add(root.data);
         preOrder(root.left,li);
         preOrder(root.right,li);
         return li;
     }
 }