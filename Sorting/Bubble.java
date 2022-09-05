package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
