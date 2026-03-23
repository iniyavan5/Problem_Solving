class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        int left=0;
        int right=n-1;
        
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                res.add(left+1);
                res.add(right+1);
                return res;
            }
            else if(sum<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        res.add(-1);
        res.add(-1);
        return res;
    }
}