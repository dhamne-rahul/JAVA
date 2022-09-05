package BasicQuestion.Array;

import java.util.Scanner;

public class MaxiPopulationYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[][] logs=new int[m][2];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<2;j++)
            {
                logs[i][j]=sc.nextInt();
            }
        }
        int year=getans(logs,m);
        System.out.println(year);
    }

    private static int getans(int[][] logs,int m) {
        int year=logs[0][0];
        int count=1;
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<m;i++)
        {
            if(logs[i-1][1]-logs[i][0]>0)
            {
                count++;
                if(count>ans)
                {
                    ans=count;
                    year=logs[i][0];
                }
            }
            if(logs[i-1][1]<logs[i][1]){
                count--;
            }
        }
        return year;
    }
}
