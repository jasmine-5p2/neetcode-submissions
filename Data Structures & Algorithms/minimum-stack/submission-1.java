class MinStack {

  Stack<Integer>minStack;
   Stack<Integer>st;
    public MinStack() {
       minStack =new Stack<>();
       st= new Stack<>();
        
    }
    
    public void push(int val) {
         st.push(val);
         if(minStack.isEmpty()){
            minStack.push(val);
         }else{
            minStack.push(Math.min(val,minStack.peek()));
         }
        
    }
    
    public void pop() {
        st.pop();
        minStack.pop();
        
        
    }
    
    public int top() {
        return  st.peek();
        
    }
    
    public int getMin() {
    return minStack.peek();
       



        
    }
}
