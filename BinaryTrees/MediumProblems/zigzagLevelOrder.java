package BinaryTrees.MediumProblems;

class zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Creating an array list to result the elements at the end
        List<List<Integer>> result = new ArrayList<>();

        // BaseCase Condition if the root is ending stage
        if(root == null) return result;

        // Creating a Queue to store the elements
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // LevelOrder
        int lvl = 0;
        // Traversal Queue ,Until it is Empty
        while(!q.isEmpty()){

        // Create a Level ArrayList to Store the elements
        List<Integer> level = new ArrayList<>();
        int size = q.size();
        for(int i=0;i<size;i++){
            TreeNode x = q.remove();
            level.add(x.val);
            if(x.left!=null) q.add(x.left);
            if(x.right!=null) q.add(x.right);
        }

        // Checking the level is even or off

            if(lvl %2 == 1) //It is Odd
            // So we should reverse the array
            Collections.reverse(level);

            // Add Up to the result;
            result.add(level);
            lvl++;
        }
        return result;

        
    }
}
