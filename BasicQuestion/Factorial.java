package BasicQuestion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int fact=1;
        int i=1;
        while(i<=number)
        {
            fact*=i;
            i++;
        }
        System.out.println(fact);
    }
}
