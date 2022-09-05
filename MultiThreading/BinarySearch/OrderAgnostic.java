package MultiThreading.BinarySearch;

import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int index=ordeAgno(arr,key);
        System.out.println(index+1);
        // if(index>=0)
        // {
        //     System.out.println("element is found is "+index);
        // }
        // else{
        //     System.out.println("not found");
        // }
    }

    private static int ordeAgno(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

