class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] word=s.split("\\.+");
        StringBuilder result=new StringBuilder();
        for(int i=word.length-1;i>=0;i--)
        {
            if(!word[i].isEmpty())
            {
                result.append(word[i]);
                result.append(".");
            }
        }
        if(result.length()>0)
        {
            result.deleteCharAt(result.length()-1);
        }
        return result.toString();
    }
}
