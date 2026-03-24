class Solution {
    public int countOnes(int[] arr) {
        // code here
        int count=0;
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==1)
            {
                left=mid+1;
            }
            if(arr[mid]==0)
            {
                right=mid-1;
            }
        }
        count+=(right+1);
        return count;
    }
}