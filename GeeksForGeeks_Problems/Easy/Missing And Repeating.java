class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int repeat=-1;
        int miss=-1;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int val=Math.abs(arr[i]);
            if(arr[val-1]<0)
            {
                repeat=val;
            }
            else
            {
                arr[val-1]=-arr[val-1];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                miss=i+1;
            }
        }
        res.add(repeat);
        res.add(miss);
        return res;
    }
}
