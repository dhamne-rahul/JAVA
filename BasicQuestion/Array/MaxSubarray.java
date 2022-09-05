package BasicQuestion.Array;

import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=getans(arr);
        System.out.println(ans);
    }

    private static int getans(int[] arr) {
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>max_sum)
            {
                max_sum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max_sum;
    }

}
