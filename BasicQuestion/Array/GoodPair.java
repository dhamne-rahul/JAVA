package BasicQuestion.Array;

import java.util.Scanner;

public class GoodPair {
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
        int ans=0;
        int i=0;
        while(i<arr.length-1)
        {
            int j=i+1;
            while(j<arr.length)
            {
                if(arr[i]==arr[j])
                {
                    ans++;;
                }
                j++;
            }
            i++;
        }
        return ans;
    }
}
