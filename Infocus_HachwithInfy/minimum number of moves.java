import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 0;

        while (N > 1) {
            if (N % 3 == 0) {
                N = N / 3;
            } else if (N % 2 == 0) {
                N = N / 2;
            } else {
                N = N - 1;
            }
            result++;
        }

        System.out.println(result);
    }
}
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();

//         int[] dp = new int[N + 1];
//         dp[1] = 0;

//         for (int i = 2; i <= N; i++) {
//             dp[i] = dp[i - 1] + 1;

//             if (i % 2 == 0)
//                 dp[i] = Math.min(dp[i], dp[i / 2] + 1);

//             if (i % 3 == 0)
//                 dp[i] = Math.min(dp[i], dp[i / 3] + 1);
//         }

//         System.out.println(dp[N]);
//     }
// }