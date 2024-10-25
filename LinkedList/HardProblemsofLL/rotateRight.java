package LinkedList.HardProblemsofLL;

class rotateRight {
    ListNode findNthNode(ListNode head , int k){
        ListNode temp = head;
        int cnt = 1;
        while(temp!=null){
            if(cnt==k) return temp;
        cnt++;
        temp=temp.next;
        }
        return temp;
    }
    

    public ListNode rotateRight(ListNode head, int k) {
        // TC:O(2N) SC:O(1)
        if(head == null || k==0) return head;
        ListNode tail = head;
        int len = 1;
        while(tail.next !=null){
            len++;
            tail=tail.next;
        }
        if(k%len == 0) return head;
         
         k = k%len;
         tail.next = head;
         ListNode newLastNode = findNthNode(head,len-k);
         head = newLastNode.next;
         newLastNode.next = null; 
        return head;
    }
}
