package BasicQuestion.Array;

import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] gain=new int[n];
        for(int i=0;i<n;i++)
        {
            gain[i]=sc.nextInt();
        }
        int ans=getans(gain);
        if(ans<0)
        {
            ans=0;
        }
        System.out.println(ans);
    }

    private static int getans(int[] gain) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<gain.length;i++)
        {
            sum+=gain[i];
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
    }
}
