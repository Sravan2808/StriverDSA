/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // BruteForce Approach TC:O(N)+O(Nlogn) SC:O(N)
        // Map<ListNode,Integer>  map = new HashMap<>();
        // ListNode temp = headA;
        // while(temp!=null){
        //     map.put(temp,map.getOrDefault(temp,0)+1);
        //     temp=temp.next;
        // }
        // temp = headB;
        // while(temp!=null){
        //     if(map.containsKey(temp)) return temp;
        //     temp=temp.next;
        // }
        // return null;

        // BetterApproach TC:O(n1+2n2) SC:O(1)

    //     ListNode t1 = headA;
    //     ListNode t2 = headB;
    //     int N1=0,N2=0;
    //     while(t1!=null){
    //         N1++;
    //         t1=t1.next;
    //     }
    //     while(t2!=null){
    //         N2++;
    //         t2=t2.next;
    //     }
    //     if(N1<N2)
    //         return collisionPart(headA,headB,N2-N1);
    //     else
    //     return collisionPart(headB,headA,N1-N2);
    // }
    // ListNode collisionPart(ListNode t1,ListNode t2,int d){
    //     while(d!=0){
    //         d--;
    //         t2=t2.next;
    //     }
    //     while(t1!=t2){
    //         t1=t1.next;
    //         t2=t2.next;
    //     }
    //     return t1;

    // Optimal Approach
    if(headA==null || headB==null) return null;
    ListNode t1 = headA , t2 = headB;
    while(t1!=t2){
        t1=t1.next;
        t2=t2.next;
        if(t1==t2) return t1;
        if(t1==null) t1=headB;
        if(t2==null) t2=headA;
    }
    return t1;
    
    }

}