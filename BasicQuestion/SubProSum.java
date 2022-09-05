package BasicQuestion;

import java.util.Scanner;

public class SubProSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int prod=1;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        System.out.println(sum);
        System.out.println(prod);
        System.out.println("answer:"+(prod-sum));
    }
}
