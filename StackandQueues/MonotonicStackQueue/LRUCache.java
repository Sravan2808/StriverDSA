package StackandQueues.MonotonicStackQueue;

import java.util.Map;

class LRUCache {
    Node head = new Node(0,0), tail = new Node(0,0);
    Map<Integer,Node> mp = new HashMap<>();
    int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            Node node = mp.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            remove(mp.get(key));
        }
        if(mp.size()==cap){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    void remove(Node node){
        mp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    void insert(Node node){
        mp.put(node.key,node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;
       
    }
    class Node{
        Node prev,next;
        int key,value;
        Node(int key_ ,int value_){
            key = key_;
            value = value_;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
