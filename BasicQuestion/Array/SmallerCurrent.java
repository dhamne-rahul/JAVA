package BasicQuestion.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerCurrent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] ans=getans(arr);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] getans(int[] arr) {
        int[] ans=new int[arr.length];
        int count=0;
        int i=0;
        while(i<arr.length)
        {
            int j=0;
            while(j<arr.length)
            {
                if(arr[j]<arr[i])
                {
                    count++;
                }
                j++;
            }
            ans[i]=count;
            count=0;  
            i++;
        }
        return ans;
    }
}
