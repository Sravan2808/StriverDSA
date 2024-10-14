/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;

    }
    public boolean isPalindrome(ListNode head) {
        // BruteForce Approach TC:O(2N) SC:O(N)
        // Stack<Integer> st = new Stack<Integer>();
        // ListNode temp = head;
        // while(temp!=null){
        //     st.push(temp.val);
        //     temp=temp.next;
        // }
        // temp = head;
        // while(temp!=null){
        //     if(temp.val!=st.peek()) return false;
        //     temp=temp.next;
        //     st.pop();
        // }
        // return true;

        // OptimalApproach TC:O(2N),SC:O(1)
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        while(second!=null){
            if(first.val!=second.val){
                reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newHead);
        return true;
    }
}
