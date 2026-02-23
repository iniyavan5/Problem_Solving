class Solution {
    public int scoreDifference(int[] nums) {
        int n=nums.length;
        int score1=0;
        int score2=0;
        int active=0;
        for(int i=0;i<n;i++)
            {
                if(nums[i]%2!=0)
                {
                   active=1-active;
                }
                if(i%6==5)
                {
                    active=1-active;
                }
                if(active==0)
                {
                    score1+=nums[i];
                }
                if(active==1)
                {
                     score2+=nums[i];   
                }
            }
        return score1-score2;
    }
}