package BasicQuestion;

import java.util.Scanner;

public class LcmHcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int l=gcd(number1,number2);
        System.out.println(l);
        int h=lcm(number1,number2);
        System.out.println(h);
    }
    private static int lcm(int number1, int number2) {
        return(number1*number2/gcd(number1, number2));
    }
    public static int gcd(int number1,int number2)
    {
        while(number1!=0)
        {
            int rem=number1%number2;
            number1=number2;
            number2=rem;
        }
        return number1;
    }
}
