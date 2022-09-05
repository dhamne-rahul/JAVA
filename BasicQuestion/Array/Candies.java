package BasicQuestion.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int kids=sc.nextInt();
        for(int i=0;i<kids;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        int extracandies=sc.nextInt();
        ArrayList<Boolean> ans=getans(list,extracandies);
        System.out.println(ans);
    }

    private static ArrayList<Boolean> getans(ArrayList<Integer> list,int extracandies) {
        ArrayList<Boolean> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i:list)
        {
            if(i>max)
            {
                max=i;
            }
        }
        for(int i:list)
        {
            if(i+extracandies>=max)
            {
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;

    }
}
