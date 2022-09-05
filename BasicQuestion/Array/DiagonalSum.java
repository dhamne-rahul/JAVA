package BasicQuestion.Array;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int ans=getSum(arr,m,n);
        System.out.println(ans);
    }

    private static int getSum(int[][] arr,int m,int n) {
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i==n-j-1)
                {
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}
