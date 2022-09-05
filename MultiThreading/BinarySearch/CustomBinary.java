package MultiThreading.BinarySearch;

import java.util.Scanner;

public class CustomBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int index=binarySearch(arr,key);
        if(index>0)
        {
            System.out.println("Element found at "+index+1);
        }
        else{
            System.out.println(" Element not found");
        }
    }
    public static int binarySearch(int[] arr,int key)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(key<arr[mid])
            {
                end=mid-1;
            }
            else if(key>arr[mid])
            {
                 start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
