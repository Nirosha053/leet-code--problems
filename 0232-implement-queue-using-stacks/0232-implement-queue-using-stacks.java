class MyQueue {
  Stack<Integer>s=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
       s.push(x); 
    }
    
    public int pop() {
     if (s.size() == 1)
            return s.pop();

        int temp = s.pop();
        int ans = pop();
        s.push(temp);
        return ans; 
    }
    
    public int peek() {
         if (s.size() == 1)
            return s.peek();

        int temp = s.pop();
        int ans = peek();
        s.push(temp);
        return ans;
    }
    
    public boolean empty() {
        return s.isEmpty(); 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */