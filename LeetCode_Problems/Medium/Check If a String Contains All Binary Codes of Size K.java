class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
        HashSet<String> set=new HashSet<>();       
        int possible=(int)Math.pow(2,k);
        for(int i=0;i<=n-k;i++)
        {
            String sub = s.substring(i, i + k);
            set.add(sub);
        }
        
        if(set.size()==(possible))
        {
            return true;
        }
        return false;
    }
}