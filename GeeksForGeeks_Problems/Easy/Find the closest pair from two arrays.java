class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=m-1;
        int closediff=Integer.MAX_VALUE;
        int a=0,b=0;
        while(i<n&&j>=0)
        {
            int sum=arr1[i]+arr2[j];
            int diff=Math.abs(sum-x);
            if(diff<closediff)
            {
                closediff=diff;
                a=arr1[i];
                b=arr2[j];
            }
            if(sum>x)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.add(a);
        res.add(b);
        return res;
    }
}