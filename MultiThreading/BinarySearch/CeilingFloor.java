package MultiThreading.BinarySearch;

import java.util.Scanner;

public class CeilingFloor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=ceiling(arr,target);
        System.out.println(ans);
        int floor=floor(arr, target);
        System.out.println(floor);
    }

    private static int ceiling(int[] arr, int target) {
        int st=0;
        int en=arr.length-1;
        while(st<=en)
        {
            int mid=st+(en-st);
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(target<arr[mid])
            {
                en=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return arr[st];
    }
    private static int floor(int[] arr, int target) {
        int st=0;
        int en=arr.length-1;

        while(st<=en)
        {
            int mid=st+(en-st);
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(target<arr[mid])
            {
                en=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return arr[en];
    }
}
