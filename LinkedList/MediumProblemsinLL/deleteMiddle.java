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
    public ListNode deleteMiddle(ListNode head) {
        // BruteForcce Approach TC:O(N+N/2) SC:O(1)
        // if(head == null && head.next == null) return null;
        // ListNode temp = head;
        // int N = 0;
        // while(temp!=null){
        //     N++;
        //     temp= temp.next;
        // }
        // int res = (N/2);
        // temp = head;
        // while(temp != null){
        //     res--;
        //     if(res == 0){
        //         ListNode middle = temp.next;
        //         temp.next = temp.next.next;
        //         break;
        //     }
        //     temp = temp.next;
        // }
        // return head;

        // Optimize Approach TC:O(N/2) SC:O(1)
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
        
    }
}