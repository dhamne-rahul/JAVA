package MultiThreading.Searching;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int start=3;
        int end=5;
        int key=sc.nextInt();
        boolean ans=getAns(arr,start,end,key);
        System.out.println(ans);
    }

    private static boolean getAns(int[] arr, int start, int end, int key) {
            for(int i=start;i<=end;i++)
            {
                if(arr[i]==key)
                {
                    return true;
                }
            }
            return false;
    }
}
