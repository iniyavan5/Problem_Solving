class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]<nums[i+1])
            {
                i--;
            }
        return i+1;
    }
}