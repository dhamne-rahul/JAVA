package BasicQuestion;

import java.util.Scanner;

public class ThreeLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println(largest(n1,n2,n3));
    }
    public static int largest(int n1,int n2,int n3)
    {
        return( Math.max(n1, Math.max(n2, n3)));
    }
}
