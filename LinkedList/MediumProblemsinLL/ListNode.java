package LinkedList.MediumProblemsinLL;


  
 public class ListNode {
    int val;
     ListNode next;
    public ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

public class middleLL {
    public ListNode middleNode(ListNode head) {
        // Brute Force Approach TC:O(N+N/2) SC:O(1)
        // if(head==null || head.next == null) return head;
        // ListNode temp = head;
        // int cnt = 0;
        // while(temp!=null){
        //     cnt++;
        //     temp=temp.next;
        // }
        // int midNode = (cnt/2)+1;
        // temp=head;
        // while(temp!=null){
        //     midNode--;
        //     if(midNode == 0)
        //     break;
        //     temp=temp.next;
        // }
        // return temp;

        // Optimal Approach 
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr !=null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
    
}
