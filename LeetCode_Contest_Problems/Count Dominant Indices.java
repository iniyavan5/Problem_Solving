class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        if (n < 2) 
        {
            return 0;
        }
        int count = 0;
        long suffixSum = 0;
        for (int i = n - 2; i >= 0; i--) {
            suffixSum += nums[i + 1];
            int rightCount = n - i - 1; 
            double average = (double) suffixSum / rightCount;
            if (nums[i] > average)
            {
                count++;
            }
        }
        return count;
    }
}