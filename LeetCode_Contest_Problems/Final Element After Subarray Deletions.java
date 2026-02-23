class Solution {
    public int finalElement(int[] nums) {
        
        int n=nums.length;
        if(nums[0]>nums[n-1])
        {
            return nums[0];
        }
        return nums[n-1];
    }
}