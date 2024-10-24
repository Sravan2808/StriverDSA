import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

      class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
        }
    }

*****************************************************************/

public class findPairWithGivenSum {
    public static Node findtail(Node<Integer> head){
        Node tail = head;
        while(tail.next != null) tail=tail.next;
        return tail;
    }

    public static boolean findPair(Node<Integer> head, int k) {
        // Write your code here.
        Node right = findtail(head);
        Node left = head;

        while(left<right){
            if(left+right == k){
                let = left.next;
                right = right.prev;
                return true;
                
            }
            else if(left+right < k) left =  left.next;
            else right = right.prev;
        }
        return false;
    }

}
