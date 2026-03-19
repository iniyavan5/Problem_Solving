
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int minDisturbance = Integer.MAX_VALUE;
        int result = 0;
        for(int X = 0; X <=C; X++) 
        {
            int oil = X;
            int disturbance = 0;
            for(int i = 0; i < N; i++) 
            {
                if(A[i] == 1) 
                { 
                    if(oil == C) 
                    {
                        disturbance++;
                    }
                    else
                    {
                        oil++;
                    }
                } 
                else 
                { 
                    if(oil == 0)
                    {
                        disturbance++;
                    }
                    else 
                    {
                        oil--;
                    }
                }
            }

            if(disturbance < minDisturbance) {
                minDisturbance = disturbance;
                result = X;
            }
        }

        System.out.println(result);
    }
}