package LinkedList.MediumProblemsinLL;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseLL {
    public ListNode reverseList(ListNode head) {

        // Brute Force Approach TC:O(2n) SC:O(n)
        // ListNode temp = head;
        // Stack<Integer> st = new Stack<>();
        // while(temp!=null){
        // st.push(temp.val);
        // temp=temp.next;
        // }
        // temp=head;
        // while(temp!=null){
        // temp.val=st.pop();
        // temp=temp.next;
        // }
        // return head;

        // OptimalApproach

        // Iterative Approach TC:O(N) SC:O(1)
        ListNode front = head;
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

  
    }
}
