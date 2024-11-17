package StackandQueues.Learning;

class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        try{
        arr[++top] = x;
        }
        catch(Exception e){
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        // Your Code
        return (top==-1)?-1:arr[top--];
    }
}
