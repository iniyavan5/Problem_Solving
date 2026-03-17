class Solution {
    public boolean isValid(String s) {
        Stack<Character> str=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='[' || ch=='{' || ch=='(')
            {
                str.push(ch);
            }
            else
            {
                if(str.isEmpty())
                {
                    return false;
                }
                char top=str.pop();
                if(ch==']' && top!='[')
                {
                    return false;
                }
                if(ch=='}' && top!='{')
                {
                    return false;
                }
                if(ch==')' && top!='(')
                {
                    return false;
                }
            }
        }
        return str.isEmpty();
    }
}