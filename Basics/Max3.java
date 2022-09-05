package Basics;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        if(b>a&&b>c)
        {
            max=b;
        }
        else if(c>a&&c>b)
        {
            max=c;

        }
        // System.out.println(max);
        int ans=MaxThree(a,b,c);
        System.out.println("ans:"+ans);
    }

    private static int MaxThree(int a, int b, int c) {
        int max1=Math.max(a, Math.max(b, c));
        return max1;

    }
}
