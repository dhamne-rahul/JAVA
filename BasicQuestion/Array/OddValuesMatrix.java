package BasicQuestion.Array;

import java.util.Scanner;

public class OddValuesMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] indices=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                indices[i][j]=sc.nextInt();
            }
        }
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                indices[i][j]=0;
            }
        }
        makeFinalArr(indices,matrix,m,n);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static void makeFinalArr(int[][] indices,int[][] matrix,int m,int n) {
        for(int i=0;i<indices.length;i++)
        {
            //fill rows.
            for(int col=0;col<n;col++)
            {
                matrix[i][col]++;
            }
            //fill column.
            for(int row=0;row<m;row++)
            {
                matrix[row][indices[i][1]]++;
            }
        }
    }
}
