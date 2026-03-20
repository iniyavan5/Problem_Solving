import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        int sum=0;
        int max=0;
        int left=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            freq.put(a[i],freq.getOrDefault(a[i],0)+1);
            while(freq.size()>k)
            {
                freq.put(a[left],freq.get(a[left])-1);
                if(freq.get(a[left])==0)
                {
                    freq.remove(a[left]);
                }
                sum-=a[left];
                left++;
            }
            max=Math.max(max,sum);
        }
        System.out.print(max);
	}
}

