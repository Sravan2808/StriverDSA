
class countNodesinLoop {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        // BruteForce Approach TC:O(N*2LOgN) SC:O(N)
        // Map<Node,Integer> map = new HashMap<Node,Integer>();
        // Node temp = head;
        // int timer = 1;
        // while(temp!=null){
        //     if(map.containsKey(temp)){
        //         return  timer - map.get(temp);
        //     }
        //     map.put(temp,timer);
        //     timer++;
        //     temp = temp.next;
        // }
        // return 0;
        
        //OptimalApproach :TC:O(N) SC:O(1)
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                int cnt = 1;
                fast = fast.next;
                while(slow!=fast){
                    fast=fast.next;
                    cnt++;
                }
                return cnt;
            }
        }
        return 0;
    }
}
