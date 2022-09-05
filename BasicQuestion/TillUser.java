package BasicQuestion;

import java.util.Scanner;

public class TillUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=0;
        int sum=0;
        while((input=sc.nextInt())!=3)
        {
            sum+=input;
        }
        System.out.println(sum);
    }
}
