class Solution {
    public int countPrimeSetBits(int left, int right)
    {
        Set<Integer> primes=new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19));    
        int count=0;
        for(int i=left;i<=right;i++)
        {
            int setBits=Integer.bitCount(i);
            if(primes.contains(setBits))
            {
                count++;
            }
        } 
        return count;
    }
}