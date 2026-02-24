// User function Template for Java
class Solution {
    int[][] rotateMatrix(int M, int N, int Mat[][]) {
        int top = 0, bottom = M - 1;
        int left = 0, right = N - 1;
        while (top < bottom && left < right) 
        {
            int prev = Mat[top + 1][left];
            for (int i = left; i <= right; i++)
            {
                int curr = Mat[top][i];
                Mat[top][i] = prev;
                prev = curr;
            }
            top++;
            for (int i = top; i <= bottom; i++) 
            {
                int curr = Mat[i][right];
                Mat[i][right] = prev;
                prev = curr;
            }
            right--;
            if (top <= bottom) 
            {
                for (int i = right; i >= left; i--) 
                {
                    int curr = Mat[bottom][i];
                    Mat[bottom][i] = prev;
                    prev = curr;
                }
                bottom--;
            }
            if (left <= right) 
            {
                for (int i = bottom; i >= top; i--) 
                {
                    int curr = Mat[i][left];
                    Mat[i][left] = prev;
                    prev = curr;
                }
                left++;
            }
        }
        return Mat;
    }
}