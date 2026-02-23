class Solution {
    public int maxCircularSum(int arr[]) {
        int n = arr.length;
        int currentMax = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < n; i++) 
        {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);
        }
        int currentMin = arr[0];
        int minSum = arr[0];
        for (int i = 1; i < n; i++)
        {
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSum = Math.min(minSum, currentMin);
        }
        int totalSum = 0;
        for (int num : arr) 
        {
            totalSum += num;
        }
        int wrappingSum = totalSum - minSum;
        if (maxSum < 0) 
        {
            return maxSum; 
        }
        return Math.max(maxSum, wrappingSum);
    }
}