class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
        {
            return 1;
        }
        long check=1;
        while(check<=n)
        {
            check=check<<1;
        }
        return (int)(check-1)^n;
    }
}