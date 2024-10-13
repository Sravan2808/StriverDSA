/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class startingPoint {
    public ListNode detectCycle(ListNode head) {
        // BruteForce TC:O(n*2logn) SC:O(n)
        // ListNode temp = head;
        // Map<ListNode,Integer> map = new HashMap<>();
        // while(temp!=null){
        // if(map.containsKey(temp)) return temp;
        // map.put(temp,1);
        // temp=temp.next;
        // }
        // return null;

        // Optimized Approach TC:O(N) SC:O(1)

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
