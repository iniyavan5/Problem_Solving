class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char num:s.toCharArray())
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(freq.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
}