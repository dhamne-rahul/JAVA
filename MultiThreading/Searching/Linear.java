package MultiThreading.Searching;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        boolean ans=linearSearch(arr,key);
        System.out.println(ans);
    }
    private static boolean linearSearch(int[] arr, int key) {
        for(int i:arr)
        {
            if(i==key)
            {
                return true;

            }
        }
        return false;
    }
}
