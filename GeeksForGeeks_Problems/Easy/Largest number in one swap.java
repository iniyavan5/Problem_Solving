class Solution {
    public String largestSwap(String s) {
        // code here
        
        char[] arr=s.toCharArray();
        int n=arr.length;
        int[] last=new int[10];
        for(int i=0;i<n;i++)
        {
            last[arr[i]-'0']=i;
        }
        for(int i=0;i<n;i++)
        {
            int curr=arr[i]-'0';
            
            for(int j=9;j>curr;j--)
            {
                if(last[j]>i)
                {
                    int d=last[j];
                    char temp=arr[i];
                    arr[i]=arr[d];
                    arr[d]=temp;
                    return new String(arr);
                }
            }
        }
        return s;
    }
}