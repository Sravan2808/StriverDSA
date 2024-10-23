package LinkedList.DoublyLinkedList;
class Node{
    int data;
    Node next;
    Node back;

    Node(int data1,Node next1,Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class DLLinkedList {
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static Node deleteHead(Node head){
        if(head == null || head.next == null) return null;
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }
    public static Node deleteTail(Node head){
        if(head == null || head.next == null) return null;
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.back;
        tail.back = null;
        prev.next = null;
        return head;
    }
    public static Node removeKthElement(Node head,int k){
        if(head == null) return null;
        int cnt = 0;
        Node kNode = head;
        while(kNode != null){
            cnt++;
            if(cnt == k) break;
            kNode = kNode.next;
        }
        Node prev = kNode.back;
        Node front = kNode.next;

        if(prev == null && front ==null) return null;
        else if(prev == null) return deleteHead(head);
        else if(front == null ) return deleteTail(head);

        prev.next = front;
        front.back = prev;
        kNode.next = null;
        kNode.next = null;
        return head;
    }
    public static void  deleteNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;
        while(front == null){
            prev.next = null;
            temp.back = null;
            return  ;
        }
        prev.next = front;
        front.back = prev;
        temp.next = temp.back = null;
        
    }
    public static Node insertBeforeHead(Node head,int value){
        Node newHead = new Node(value,head,null);
        head.back = newHead;
        return newHead;
    }
    public static Node insertBeforetail(Node head,int value){
        if(head.next == null)
        return insertBeforetail(head, value);
        Node tail = head;
        while(tail.next != null){
            tail=tail.next;
        }
        Node prev = tail.back;
        Node newNode = new Node(value,tail,prev);
        prev.next = newNode;
        tail.back = newNode;
        return head;
    }
    public static Node insertBeforeKthElement(Node head,int k,int value){
        if(k==1){
            return insertBeforeHead(head, value);
        }
        Node temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            if(cnt == k) break;
            temp=temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(value , temp,prev);
        prev.next = newNode;
        temp.back = newNode;
        newNode.back = prev;
        return head;
    }
    public static void insertBeforeNode(Node node,int value){
        Node prev = node.back;
        Node newNode = new Node(value,node,prev);
        prev.next = newNode;
        node.back = newNode;
    }
    
    public static void main(String[] args) {
        int arr[] = {12,5,6,8};
        Node head = convertArr2LL(arr);
        // head = deleteHead(head);
        // head = deleteTail( head);
        // head = removeKthElement(head,4);
        // deleteNode(head.next);
        // head = insertBeforeHead(head, 10);
        // head = insertBeforetail(head, 100);
        // head = insertBeforeKthElement(head,4,10);
        insertBeforeNode(head.next,100);
        print(head);
    }
    
}
