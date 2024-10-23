package LinkedList.DoublyLinkedList;

public class reverseDLL {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        // TC:O(2N) SC:O(N)
        // Stack<Integer> st = new Stack<>();
        // DLLNode temp = head;
        // while(temp!=null){
        //     st.push(temp.data);
        //     temp=temp.next;
        // }
        // temp = head;
        // while(temp!=null){
        //     temp.data=st.pop();
        //     temp=temp.next;
        // }
        // return head;
        
        // TC:O(N) SC:O(1)
        if(head == null || head.next == null) return head;
        DLLNode last = null,current = head;
        while(current!=null){
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            current = current.prev;
        }
        return last.prev;
    
      // Your code here
        // TC:O(2N) SC:O(N)
        // Stack<Integer> st = new Stack<>();
        // DLLNode temp = head;
        // while(temp!=null){
        //     st.push(temp.data);
        //     temp=temp.next;
        // }
        // temp = head;
        // while(temp!=null){
        //     temp.data=st.pop();
        //     temp=temp.next;
        // }
        // return head;
        
        // TC:O(N) SC:O(1)
        if(head == null || head.next == null) return head;
        DLLNode last = null,current = head;
        while(current!=null){
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            current = current.prev;
        }
        return last.prev;
    }
}
