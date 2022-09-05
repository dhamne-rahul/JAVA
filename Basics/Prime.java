package Basics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(isPrime(number))
        {
            System.out.println("number is prime");
        }else{
            System.out.println("non-prime");
        }
    }

    private static boolean isPrime(int number) {
        if(number==1 || number==0)
        {
            return true;
        }
        for(int i=2;i<Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
