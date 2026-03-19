class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer> result=new  ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            result.add(result.get(i-1)+arr[i]);
        }
        return result;
    }
}