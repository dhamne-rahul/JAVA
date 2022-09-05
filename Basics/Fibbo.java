package Basics;

public class Fibbo {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibbo(n));
    }

    // private static void fibbo(int n) {
    //     int a=0;
    //     int b=1;
    //     System.out.print(a+" "+b+" ");
    //     for(int i=1;i<=n-2;i++)
    //     {
    //         int c=a+b;
    //         System.out.print(" "+c);
    //         a=b;
    //         b=c;
    //     }
    // }
    private static int  fibbo(int n) {
        int a=0;
        int b=1;
        int c=0;
        int count=2;
        while(count<n)
        {
            c=a+b;
            a=b;
            b=c;
            count++;
        }
        return c;
    }
}
