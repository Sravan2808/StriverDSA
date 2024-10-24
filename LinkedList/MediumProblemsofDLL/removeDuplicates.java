class removeDuplicates{
    Node removeDuplicates(Node head){
        // Code Here.
        // TimeComplexity : O(N) SpaceComplexity:O(1)
        Node temp = head;
        while(temp!=null && temp.next!=null){
            Node nextNode = temp.next;
            while(nextNode!=null && nextNode.data==temp.data) nextNode = nextNode.next;
            
            temp.next = nextNode ;
            if(nextNode!=null) nextNode.prev = temp;  
            temp =temp.next;
        }
        return head;
    }
}