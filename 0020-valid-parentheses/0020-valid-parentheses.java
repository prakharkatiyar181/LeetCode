class Solution {
    public boolean isValid(String s) {
              char c;
              int l=s.length();
            if(l==1)
            {
                    return false;
            }
            Stack<Character> st=new Stack<Character>();
                for(int i=0;i<l;i++)
                {
                     c=s.charAt(i);
                        if(c=='('||c=='{'||c=='[')
                        {
                                st.push(c);
                        }
                        else
                        {
                                if(st.empty())
                                {
                                        return false;
                                }
                                else if(c==')' && st.peek()=='(')
                                {
                                        st.pop();
                                }
                                else if(c=='}'&&st.peek()=='{')
                                {
                                        st.pop();
                                }
                                else if(c==']'&&st.peek()=='[')
                                {
                                        st.pop();
                                }
                                else
                                        return false;
                        }
                }
            boolean ans=st.empty();
            return ans;
            
            
    }
}