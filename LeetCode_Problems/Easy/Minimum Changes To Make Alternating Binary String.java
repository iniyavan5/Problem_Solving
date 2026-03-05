class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int count=0;
        int count1=0;
        for(int i=0;i<n;i++)
        {
            if((i%2==0)&&(s.charAt(i)=='1')||(i%2==1)&&(s.charAt(i)=='0'))
            {
                count++;
            }
            if((i%2==0)&&(s.charAt(i)=='0')||(i%2==1)&&(s.charAt(i)=='1'))
            {
                count1++;
            }
        }
        return Math.min(count,count1);
    }
}