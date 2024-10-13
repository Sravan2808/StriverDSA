/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class detectLoop {
    public boolean hasCycle(ListNode head) {
        // BruteForeceApproach TimeComplexity : O(N*2*logN) Sc:O(N)
        // Map<ListNode,Integer> mp = new HashMap<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     if(mp.containsKey(temp)) return true;
        //     mp.put(temp,1);
        //     temp=temp.next;
        // }
        // return false;

        // OptimizedApproach Tortoise and hare method TC:O(N),SC:O(1)
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;   
    }
}
