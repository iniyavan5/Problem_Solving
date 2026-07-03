class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        HashSet<Character> check=new HashSet<>();
        for(int right=0;right<s.length();right++)
        {
            while(check.contains(s.charAt(right)))
            {
                check.remove(s.charAt(left));
                left++;
            }
            check.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}