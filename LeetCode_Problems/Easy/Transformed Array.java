class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int k;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                k=nums[i];
                int pos=(i+k)%n;
                res[i]=nums[pos];
            }
            else if(nums[i]<0)
            {
                k=Math.abs(nums[i]);
               int neg = ((i - k) % n + n) % n;
                res[i]=nums[neg];
            }
            else
            {
                res[i]=nums[i];
            }
        }
        return res;
    }
}