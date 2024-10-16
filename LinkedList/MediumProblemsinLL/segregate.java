
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s. 
    static Node segregate(Node head) {
        // add your code here
        // BruteForce TC:O(2N) SC:O(1)
        // int cnt0 = 0;
        // int cnt1 = 0;
        // int cnt2 = 0;
        // Node temp = head;
        // while(temp!=null){
        //     if(temp.data == 0) cnt0++;
        //     else if(temp.data == 1) cnt1++;
        //     else cnt2++;
        //     temp=temp.next;
        // }
        // temp = head;
        //     while(cnt0!=0 ){
        //         temp.data = 0;
        //         temp=temp.next;
        //         cnt0--;
        //     }
        //     while(cnt1!=0 ){
        //         temp.data = 1;
        //         temp = temp.next;
        //         cnt1--;
        //     }
        //     while(cnt2!=0){
        //         temp.data = 2;
        //         temp=temp.next;
        //         cnt2--;
        //     }
        // return head;
        
        // OptimalApproach TC:O(N) SC:O(1)
        if(head == null || head.next == null) return head;
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        Node temp = head;
        while(temp!=null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }
            else{
                two.next = temp;
                two = temp;
            }
            temp =temp.next;
        }
        zero.next = (oneHead.next!=null)? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        Node newHead = zeroHead.next;
        return newHead;
    }
    
}
