class Solution {
    public int equalSumSpan(int[] a1, int[] a2) {
        // code here
        int n = a1.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum1 = 0, sum2 = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum1 += a1[i];
            sum2 += a2[i];
            int diff = sum1 - sum2;
            if (diff == 0) 
            {
                maxLen = i + 1;
            } 
            else if (map.containsKey(diff)) 
            {
                maxLen = Math.max(maxLen, i - map.get(diff));
            } 
            else {
                map.put(diff, i);
            }
        }

        return maxLen;

    }
}