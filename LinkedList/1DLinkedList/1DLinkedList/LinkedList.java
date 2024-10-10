class LinkedList{
     static Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    // insert the node at the very end in the linked list
    public void insertAtEnd(int newData){
        // intialize the newNode with the newData entered by the user
        Node newNode = new Node(newData);

        // LinkedList is Empty or not

        if(head == null){
            head = new Node(newData);
            return;
        }
        // LinkedList is not empty
        newNode.next = null;
        // traversing the linkedlist at the end of the node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // implementation of insertion of a node at the beginning
    public void insertAtBeginning(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    // implementation of insertion of a node at the middle
    public void middle(Node prev_node,int newData){
        
        if(prev_node == null){
            System.out.println("The previous node cannot contain the null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
        

    }

    // implementation of deletion of node in the linkedlist
    void deleteNode(int position){
        // linkedlist is empty
        if(head==null){
            return;
        }
        Node temp = head;
        // deletion from the beginning
        if(position == 0){
            head=temp.next;
            return;
        }
        // deletion is from other positions apart from the beginning
        for(int i=0;temp.next!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null && temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }
    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        list.insertAtEnd(10);
        System.out.println("LinkedList after successfull insertion all the nodes:");
        // list.printNodes();
        System.out.println();
        list.insertAtBeginning(1);
        list.insertAtBeginning(19);
        // list.printNodes();
        System.out.println();
        list.middle(head.next,6);
        // list.printNodes();
        list.deleteNode(2);
        list.deleteNode(0);
        list.printNodes();
    }
}