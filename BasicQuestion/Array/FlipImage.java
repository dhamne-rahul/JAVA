package BasicQuestion.Array;

import java.util.Arrays;
import java.util.Scanner;

import BasicQuestion.Swap;

public class FlipImage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] image=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                image[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            reverse(image[i]);
        }
        invert(image);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+image[i][j]);
            }
            System.out.println();
        }
    }

    private static void invert(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image.length;j++)
            {
                if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
    }

    private static void reverse(int[] arr)
    {
        int st=0;
        int en=arr.length-1;
        while(st<en)
        {
            int temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;
            en--;
        }
    }
}
