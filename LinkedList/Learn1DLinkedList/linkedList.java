package LinkedList.Learn 1D LinkedList;

public class linkedList {
    class LinkedList {
        Node head;
    
        class Node{
            int data;
            Node next;
    
            Node(int d){
                data = d;
                next = null;
            }
        }
    
    
        // implementation of insertion of a node at the end
        public void insertAtEnd(int newData){
            Node newNode = new Node(newData);
    
            // linkedlist is empty
            if(head == null){
                head = new Node(newData);
                return;
            }
    
            // linkedlist is not empty
            newNode.next = null;
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
    
            temp.next = newNode;
            return;
        }
    
        //  implementation of insertion of a node at the beginning
        public void insertAtBeginning(int newData){
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
        }
    
    
        // implementation of displaying the linkedlist
        public void displayLL(){
            Node current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        public static void main(String[] args) {
            LinkedList llist = new LinkedList();
            llist.insertAtEnd(2);
            llist.insertAtEnd(4);
            llist.insertAtEnd(8);
            
    
            System.out.println("Before insertion of 10, 1 and 19");
            llist.displayLL();
            System.out.println();
    
            llist.insertAtEnd(10);
            llist.insertAtBeginning(1);
            llist.insertAtBeginning(19);
    
    
        
            System.out.println("After insertion of 10, 1 and 19");
            llist.displayLL();
            System.out.println();
        }
    }
}
