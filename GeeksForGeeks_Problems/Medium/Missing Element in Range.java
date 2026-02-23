class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> res=new ArrayList<Integer>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        for(int i=low;i<=high;i++)
        {
            if(!(set.contains(i)))
            {
                res.add(i);
            }
        }
        return res;
    }
}