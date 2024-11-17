package StackandQueues.Learning;

public class MyQueueLL {

    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode element = new QueueNode(a);
        if(front == null) front=rear=element;
        else{ 
        rear.next = element;
        rear = element;
        }
	}
	
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null) return -1;
        
        
        int temp = front.data;
        front = front.next;
        return temp;
        
	}
    
}
