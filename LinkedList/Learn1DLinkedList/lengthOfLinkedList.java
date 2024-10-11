package LinkedList.Learn1DLinkedList;


class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

class lengthOfLinkedList {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node temp = head ;
        int cnt = 1;
        while(temp.next != null){
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
}
