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
class evenOddList{
    public ListNode oddEvenList(ListNode head) {
        // BruteForce Approach TC:O(2N) SC:O(N)
        // while(head==null && head.next!=null) return head;
        // ListNode temp = head;
        // List<Integer> arr = new ArrayList<Integer>();
        // while(temp!=null && temp.next!=null){
        //     arr.add(temp.val);
        //    temp =  temp.next.next;
        // }
        // if(temp!=null) arr.add(temp.val);
        // temp = head.next;
        // while(temp!=null && temp.next!=null){
        //     arr.add(temp.val);
        //     temp = temp.next.next;
        // }
        // if(temp!=null) arr.add(temp.val);

        // int i=0;temp=head;
        // while(temp!=null){
        //     temp.val = arr.get(i);
        //     i++;
        //     temp=temp.next;
        // }
        // return head;

        // OptimizeApproach TC:O(N) SC:O(1)
        if(head==null || head.next==null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd=odd.next;
            even=even.next;
        }
        odd.next = evenHead;
        return head;
    }
}