class Missing_Array{
    int missingNum(int arr[]) {
        long n=arr.length+1;
        long sum=(n*(n+1))/2;
        long diff=0;
        for(int i=0;i<arr.length;i++){
            diff+=arr[i];
        }
        
        return (int) (sum-diff);
    }
}