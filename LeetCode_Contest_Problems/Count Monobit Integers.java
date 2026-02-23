class Solution {
    public int countMonobit(int n) {
        int count = 1; 
        for (int i = 1; (1 << i) - 1 <= n; i++) 
        {
            count++;
        }
        return count;
    }
}