package BinaryTrees.Traversal;

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
class iterativeInOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> inOrder = new ArrayList<>();
    Stack<TreeNode> st = new Stack<>();
    TreeNode node = root;
    while(true){
        if(node!=null){
            st.push(node);
            node = node.left;
        }
        else{
            if(st.isEmpty()){
                break;
            }
            node = st.pop();
            inOrder.add(node.val);
            node = node.right;
        }
    }
    return inOrder;
    
        
    }
}