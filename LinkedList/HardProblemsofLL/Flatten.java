public class Flatten {
    Node flatten(Node root) {
        
        // code here
        // 1.)Tranverse all the linkedlist and child as well
        // 2.)Sort the Linkedlist
        // 3.)Place in the vertical direction
        // // TimeComplexity TC:O(2*N*m + xlogx) where X=(N*M) Sc:O(N*m);
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     Node temp = root;
    //     while(temp!=null){
    //         Node t2 = temp;
    //         while(t2!=null){
    //             arr.add(t2.data);
    //             t2=t2.bottom;
    //         }
    //         temp = temp.next;
    //     }
    //     Collections.sort(arr);
    //     root = Convert(arr);
    //     return root;
    // }
    //  Node Convert(ArrayList<Integer> arr){
    //     if(arr.size() == 0) return null;
    //     Node head = new Node(arr.get(0));
    //     Node temp = head;
    //     for(int i = 1;i<arr.size();i++){
    //         Node newNode = new Node(arr.get(i));
    //         temp.bottom = newNode;
    //         temp = temp.bottom;
    //     }
    //     return head;
    // Optimal Approach TC:(N*2M) Sc:O(N)
    
    if(root == null || root.next == null) return root;
    Node mergeHead = flatten(root.next);
    return mergeList(root,mergeHead);
    }
    
    Node mergeList(Node l1,Node l2){
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                res.bottom = l1;
                res = l1;
                l1=l1.bottom;
            }
            else{
                res.bottom = l2;
                res = l2;
                l2 = l2.bottom;
            }
            res.next = null;
        }
        if(l1!=null) res.bottom=l1;
        else res.bottom = l2;
        return dummyNode.bottom;
    }
    
}
