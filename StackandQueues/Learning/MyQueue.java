package StackandQueues.Learning;

class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
	int currSize = 0;

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    arr[front] = x;
	    front++;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(rear==front || rear>front) return -1;
		rear++;
		return arr[rear-1];
	} 
}

