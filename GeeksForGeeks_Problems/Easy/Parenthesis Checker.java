class Solution {
    public boolean isBalanced(String s) {
        // code here
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
