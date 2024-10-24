package LinkedList.MediumProblemsofDLL;

public class deleteAllOccurOfX {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp = head;
        while(temp!=null){
            if(temp.data == x){
                if(temp == head){
                    head = temp.next;
                }
                Node prevNode = temp.prev;
                Node nextNode = temp.next;
                if(prevNode!=null) prevNode.next = nextNode;
                if(nextNode!=null) nextNode.prev = prevNode;
                temp = temp.next;
            }
            else temp = temp.next;
        }
        return head;
    }
}
