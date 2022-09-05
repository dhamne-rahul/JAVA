package MultiThreading.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class D2Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int key =sc.nextInt();
        int[] ans=search(arr,key);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int key) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==key)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    
}
