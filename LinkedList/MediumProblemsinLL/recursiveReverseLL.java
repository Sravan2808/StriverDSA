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
class recursiveReverseLL {
    public ListNode reverseList(ListNode head) {
  // Recursive Approach TC:O(n) SC:O(n)
    if(head == null || head.next==null) return head;
    ListNode newHead = reverseList(head.next);
    ListNode front = head.next;
    front.next = head;
    head.next = null;
    return newHead;
    }
}