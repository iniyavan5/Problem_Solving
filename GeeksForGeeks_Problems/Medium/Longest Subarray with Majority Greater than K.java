class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        int n = arr.length;

        int[] transformed = new int[n];
        for (int i = 0; i < n; i++) {
            transformed[i] = (arr[i] > k) ? 1 : -1;
        }
        int prefixSum = 0;
        Map<Integer, Integer> firstOc = new HashMap<>();
        int longest = 0;
        for (int i = 0; i < n; i++) 
        {
            prefixSum += transformed[i];
            if (prefixSum > 0)
            {
                longest = i + 1;
            }
            if (!firstOc.containsKey(prefixSum)) 
            {
                firstOc.put(prefixSum, i);
            }
            if (firstOc.containsKey(prefixSum - 1)) 
            {
                int length = i - firstOc.get(prefixSum - 1);
                longest = Math.max(longest, length);
            }
        }
        return longest;

    }
}