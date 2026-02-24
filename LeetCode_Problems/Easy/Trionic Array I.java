class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<3)
        {
            return false;
        }
        int p=0;
        int q=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                p=i+1;
            }
            else
            {
                break;
            }
        }
        if(p==0 || p == n - 1)
        {
            return false;
        }
        for(int i=p;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                q=i+1;
            }
            else
            {
                break;
            }
        }
        if (q == p || q == n - 1) 
        {
            return false;
        }
        for(int i=q;i<n-1;i++)
        {
            if(nums[i]>=nums[i+1])
            {
                return false;
            }
        }
        return true;
    }
}