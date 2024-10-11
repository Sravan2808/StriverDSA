class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}
public class lengthOfLinkedList {
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

