package BinaryTrees.MediumProblems;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class traverseBoundary {
        static boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
    static void addLeftBoundary(TreeNode root,ArrayList<Integer> res){
        TreeNode curr = root.left;
        while(curr!=null){
            // If is leafNode
            if(isLeaf(curr) == false) res.add(curr.data);
            // Traverse towards leftside
            if(curr.left!=null) curr=curr.left;
            // Traverse towards RightSide
            else curr=curr.right;
        }
    }

    static void addLeaves(TreeNode root,ArrayList<Integer> res){
      
        if(root.left!=null) addLeaves(root.left,res);
          if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        if(root.right!=null) addLeaves(root.right,res);
    }

    static void addRightBoundary(TreeNode root ,ArrayList<Integer> res){
        TreeNode curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while(curr!=null){
            if(isLeaf(curr)==false) temp.add(curr.data);
            if(curr.right!=null) curr = curr.right;
            else curr = curr.left;
        }
        for(int i=temp.size()-1;i>=0;--i){
            res.add(temp.get(i));
        }
    }

    public static List<Integer> traverseBoundary(TreeNode root){
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        // if it is leafNode not to add
        if(isLeaf(root) == false) ans .add(root.data);
        // addLeftboundaryExcludingleaf
        addLeftBoundary(root,ans);
        // Inorder to get excludingElements
        addLeaves(root,ans);
        // RightLeftBoundaryExcludingElements
        addRightBoundary(root,ans);
        return ans;
    }
    
}
