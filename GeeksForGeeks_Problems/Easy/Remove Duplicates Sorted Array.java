class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
       int j=0;
       res.add(arr[0]);
       for(int i=1;i<arr.length;i++)
       {
           if(arr[i]!=res.get(j))
           {
               res.add(arr[i]);
               j++;
           }
       }
        return res;
    }
}
