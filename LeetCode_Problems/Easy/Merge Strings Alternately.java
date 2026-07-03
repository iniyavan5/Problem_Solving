class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        String res="";
        for(int i=0;i<n+m;i++)
        {
            if(i<word1.length())
            {
                res+=Character.toString(word1.charAt(i));
            }
            if(i<word2.length())
            {
                res+=Character.toString(word2.charAt(i));
            }
        }
        return res;
    }
}