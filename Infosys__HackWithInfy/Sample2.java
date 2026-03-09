
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		long H=Long.parseLong(br.readLine());
        long[] arr=new long[(int)N];
        long sum1=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=Long.parseLong(br.readLine());
            sum1+=arr[i];
        }
        long sum=(long)M*H;
        int count=0;
        while(sum1>sum && count<N)
        {
            sum1-=arr[count];
            count++;
        }
        System.out.print(count);
	}
}