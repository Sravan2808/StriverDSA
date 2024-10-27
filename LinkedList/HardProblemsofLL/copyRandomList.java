public class copyRandomList {
    void insertCopyInBetween(Node head){
        Node temp = head;
        while(temp!=null){
            Node nextElement = temp.next;
            Node copy = new Node(temp.val);
            copy.next = nextElement;
            temp.next = copy;

            temp = nextElement;
        }
    }
    void connectRandomPointers(Node head){
        Node temp = head;
        while(temp!=null){
            Node copyNode = temp.next;
            if(temp.random!=null) copyNode.random = temp.random.next;
            else copyNode.random = null;

            temp = temp.next.next; 
        }
    }

        Node getDeepCopyList(Node head){
            Node temp = head;
            Node dummyNode = new Node(-1);
            Node res = dummyNode;

            while(temp!=null){
                res.next = temp.next;
                res = res.next;

                temp.next =temp.next.next;
                temp = temp.next;
            }
            return dummyNode.next;
        }
    public Node copyRandomList(Node head) {
        //  Node temp = head;
        // // Create a HashMap to map original nodes
        // // to their corresponding copied nodes
        // HashMap<Node, Node> map = new HashMap<>();

        // // Step 1: Create copies of each
        // // node and store them in the map
        // while (temp != null) {
        //     // Create a new node with the
        //     // same val as the original node
        //     Node newNode = new Node(temp.val);
        //     // Map the original node to its
        //     // corresponding copied node in the map
        //     map.put(temp, newNode);
        //     // Move to the next node in the original list
        //     temp = temp.next;
        // }

        // temp = head;
        // // Step 2: Connect the next and random
        // // pointers of the copied nodes using the map
        // while (temp != null) {
        //     // Access the copied node corresponding
        //     // to the current original node
        //     Node copyNode = map.get(temp);
        //     // Set the next pointer of the copied node
        //     // to the copied node mapped to the
        //     // next node in the original list
        //     copyNode.next = map.get(temp.next);
        //     // Set the random pointer of the copied node
        //     // to the copied node mapped to the
        //     // random node in the original list
        //     copyNode.random = map.get(temp.random);
        //     // Move to the next node in the original list
        //     temp = temp.next;
        // }

        // // Return the head of the
        // // deep copied list from the map
        // return map.get(head);

        // optimzed Approach
        // TC:O(3N) SC:O(N)
        insertCopyInBetween(head);
        connectRandomPointers(head);
        return getDeepCopyList(head);
    }
    
}
