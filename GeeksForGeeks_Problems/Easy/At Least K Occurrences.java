import java.util.*;
class Solution {
    public int firstElementKTime(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            
            if (freq.get(num) >= k) {
                return num; 
            }
        }
        
        return -1;
    }
}