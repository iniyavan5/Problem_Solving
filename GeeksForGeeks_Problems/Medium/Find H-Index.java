class Solution {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int n=citations.length;
        int[] Paper=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            Paper[i]=n-i;
        }
        for(int i=0;i<n;i++)
        {
            if(citations[i]>=Paper[i])
            {
                count++;
            }
        }
        return count++;
    }
}