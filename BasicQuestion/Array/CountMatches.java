package BasicQuestion.Array;

import java.io.StreamCorruptedException;
import java.util.Scanner;

public class CountMatches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[][] items=new String[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                items[i][j]=sc.next();
            }
        }
        String ruleKey=sc.next();
        String ruleValue=sc.next();
        int ans=getans(items,ruleKey,ruleValue);
        System.out.println(ans);

    }

    private static int getans(String[][] items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.length;i++)
        {
            if(ruleKey=="type" && items[i][0]==ruleValue)
            {
                count++;
            }
            else if(ruleKey=="color" && items[i][1]==ruleValue)
            {
                count++;
            }
            else if(ruleKey=="name" && items[i][2]==ruleValue)
            {
                count++;
            }
        }
        return count;
    }
}
