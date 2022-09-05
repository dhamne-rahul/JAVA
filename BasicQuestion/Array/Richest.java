package BasicQuestion.Array;

import java.util.Scanner;

public class Richest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] nums=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                nums[i][j]=sc.nextInt();
            }
        }
        int ans=getans(nums,row,col);
        System.out.println("ans:"+ans);
    }

    private static int getans(int[][] nums,int row ,int col) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum+=nums[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
            sum=0;
        }
        return max;
    }
}
