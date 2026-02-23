class Solution {
    public String reverseByType(String s) {
        StringBuilder letters=new StringBuilder();
        StringBuilder special=new StringBuilder();
        for(char ch:s.toCharArray())
            {
                if(Character.isLetter(ch))
                {
                    letters.append(ch);
                }
                else{
                    special.append(ch);
                }
            }
        letters.reverse();
        special.reverse();
        StringBuilder res=new StringBuilder();
        int li=0;
        int si=0;
        for(char ch:s.toCharArray())
            {
                if(Character.isLetter(ch))
                {
                    res.append(letters.charAt(li));
                    li++;
                }
                else{
                    res.append(special.charAt(si));
                    si++;
                }
            }
        return res.toString();
    }
}