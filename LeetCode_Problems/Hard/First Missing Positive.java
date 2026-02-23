class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                set.add(nums[i]);
            }
        }
        for(int i=1;i<n+1;i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }
        return n+1;
    }
}