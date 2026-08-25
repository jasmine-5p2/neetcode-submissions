class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st  = new Stack<>();
      
        
         for(String t:tokens){
            if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/")){
            int b=st.pop();
            int a=st.pop();
              int res=0;
            if(t.equals("+")){
                res=a+b;

            }else if(t.equals("-")){
                res=a-b;
            }else if(t.equals("*")){
                res=a*b;
            }else if(t.equals("/")){
                res=(a/b);
            }
            st.push(res);
            }else{
            st.push(Integer.parseInt(t));
            }
         }
         return st.pop();
        
    }
}
