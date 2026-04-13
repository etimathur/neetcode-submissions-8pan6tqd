class Solution {
    public boolean isValid(String st) {
        Stack<Character> s = new Stack();
        int i = 0;
        for(i = 0; i< st.length(); i++) {
            char c = st.charAt(i);

            if(c == '[' || c == '{' || c =='(')
                s.push(c);
            
            else if(c == ']' && !s.isEmpty() && s.peek() == '[')
                s.pop();
            
            else if(c == '}' && !s.isEmpty() && s.peek() == '{')
                s.pop();
            
            else if(c == ')' && !s.isEmpty() && s.peek() == '(')
                s.pop();
            else 
                return false;
        }

        if(s.size() == 0 && i == st.length())
            return true;
        return false;
    }
}
