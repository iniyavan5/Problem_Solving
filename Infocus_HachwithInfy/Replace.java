import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int k=0;
        while(k==0)
        {
            if(A[left]>A[target])
            {
                int temp=A[left];
                A[left]=A[target];
                A[target]=temp;
                k++;
                break;
            }
            else
            {
                left++;
                target++;
            }
        }
        System.out.println(Arrays.toString(A));
	}
}