import java.util.*;
public class Main
{
    public static boolean checkstatus(int N,long[] V,int M,long H,int start)
    {
        int i=start;long hh=H;
        while(i<N)
        {
            if(M==0)
            {
               return false;
            }
            if(hh>V[i])
            {
                hh-=V[i];
                i++;
            }
            else if(hh==V[i])
            {
                hh=H;
                M--;
                i++;
            }
            else
            {
                M--;
                hh=H;
            }
        }
        return true;
    }
	public static void main(String[] args)
	{
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int M=sc.nextInt();
            long H=sc.nextLong();
            long[] V=new long[N];
            
            for(int i=0;i<N;i++)
            {
                V[i]=sc.nextLong();
            }
            int left=0,right=N-1,ans=0;
            while(left<=right)
            {
                int mid=(left+right)/2;
                if(checkstatus(N,V,M,H,mid))
                {
                    ans=mid;
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            System.out.print(ans);
	}
}














