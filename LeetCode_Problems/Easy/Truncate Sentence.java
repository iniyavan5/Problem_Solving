class Solution {
    public String truncateSentence(String s, int k) {
        int split=0;
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                split++;
            }
            if(split==k)
            {
                break;
            }
        }
        return s.substring(0,i);
    }
}
