class Solution {
    public String maximumXor(String s, String t) {
        String set = t;
        int n = s.length();
        int countT0 = 0, countT1 = 0;
        for (char c : set.toCharArray()) 
        {
            if (c == '0') 
            {
                countT0++;
            }
            else
            {
                countT1++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) 
        {
            char cs = s.charAt(i);
            if (cs == '0') 
            {
                if (countT1 > 0)
                {
                    result.append('1');
                    countT1--;
                } 
                else {
                    result.append('0');
                    countT0--;
                }
            } 
            else { 
                if (countT0 > 0) {
                    result.append('1');
                    countT0--;
                } else {
                    result.append('0');
                    countT1--;
                }
            }
        }
        return result.toString();
    }
}