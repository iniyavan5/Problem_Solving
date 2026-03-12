class Solution {
    public int findComplement(int num) {
        
        // String s=Integer.toBinaryString(num);
        // char[] ch=s.toCharArray();
        // for(int i=0;i<s.length();i++)
        // {
            
        //     if(ch[i]=='0')
        //     {
        //        ch[i]='1';
        //     }
        //     else
        //     {
        //         ch[i]='0';
        //     }
        // }
        // String check=new String(ch);
        // int res=Integer.parseInt(check,2);
        // return res;
        long mask=1;
        while(mask<=num)
        {
            mask=mask<<1;
        }
        return (int)(mask-1)^num;
    }
}