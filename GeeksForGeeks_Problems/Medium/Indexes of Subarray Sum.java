
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n=arr.length;
        int left=0;
        ArrayList<Integer> res=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            while(sum>target&& left<i)
            {
                sum-=arr[left];
                left++;
            }
            if(sum==target)
            {
                res.add(left+1);
                res.add(i+1);
                return res;
            }
            
        }
        res.add(-1);
        return res;
    }
}
