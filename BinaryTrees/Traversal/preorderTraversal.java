package BinaryTrees.Traversal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class preorderTraversal {
    List<Integer> result =  new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
       
        if(root == null) return result;
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
        
    }
    
}
