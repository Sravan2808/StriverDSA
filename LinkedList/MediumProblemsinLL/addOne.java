import org.w3c.dom.Node;

class Solution {
    Node reverse(Node head){
        if(head == null || head.next==null){
            return head;
        }
        Node temp = head;
        Node prev = null;
        Node front = null;
        while(temp!=null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        // TWo  Aprroach :TC:O(3N) SC:O(1)
        head = reverse(head);
        Node temp = head ;
        int carry = 1;
        while(temp!=null){
            temp.data = temp.data + carry;
        
        if(temp.data<10){
            carry = 0;
            break;
        }
        else{
            temp.data = 0;
            carry = 1;
        }
        temp=temp.next;
        }
        if(carry == 1){
        Node newNode = new Node(1);
        head=reverse(head);
        newNode.next = head;
        return newNode;
    }
    head = reverse(head);
    return head;
    }
}


//  public static int helper(Node temp) {
//     if (temp == null)
//     return 1;
// int carry = helper(temp.next);
// temp.data += carry; 
// if (temp.data >= 10) {
// temp.data%=10;
// return 1; 
// }
// return 0; 
// }

// public static Node addOne(Node head) {
// int carry = helper(head);
// if (carry == 1) { 
//     Node newHead = new Node(1); 
//     newHead.next = head;
//     return newHead; 
// }
// return head; 
// }