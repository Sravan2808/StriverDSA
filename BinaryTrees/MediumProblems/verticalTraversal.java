package BinaryTrees.MediumProblems;

public class verticalTraversal 
 {
   public List<List<Integer>> verticalTraversal(TreeNode root) {

       Map<Integer, Map<Integer, List<Integer>>> nodes = new TreeMap<>();

       // Queue for BFS traversal: stores the node and its (x, y) position
       Queue<Pair<TreeNode, Pair<Integer, Integer>>> todo = new LinkedList<>();
       todo.add(new Pair<>(root, new Pair<>(0, 0)));

       while (!todo.isEmpty()) {
           Pair<TreeNode, Pair<Integer, Integer>> p = todo.poll();
           TreeNode temp = p.getKey();

           int x = p.getValue().getKey(); // Horizontal distance
           int y = p.getValue().getValue(); // Vertical level

           // Insert the value into the map
           nodes.computeIfAbsent(x, k -> new TreeMap<>())
                .computeIfAbsent(y, k -> new ArrayList<>())
                .add(temp.val);

           // Add left and right children to the queue
           if (temp.left != null) {
               todo.add(new Pair<>(temp.left, new Pair<>(x - 1, y + 1)));
           }
           if (temp.right != null) {
               todo.add(new Pair<>(temp.right, new Pair<>(x + 1, y + 1)));
           }
       }

       // Prepare the final result
       List<List<Integer>> ans = new ArrayList<>();
       for (Map<Integer, List<Integer>> ys : nodes.values()) {
           List<Integer> col = new ArrayList<>();
           for (List<Integer> values : ys.values()) {
               Collections.sort(values); // Sort values at each level
               col.addAll(values);
           }
           ans.add(col);
       }
       return ans;
   }
}

