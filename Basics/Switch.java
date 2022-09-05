package Basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op1=sc.nextInt();
        int op2=sc.nextInt();
        char ch=sc.next().trim().charAt(0);
        switch(ch)
        {
            case '+':
            System.out.println(op1+op2);
            break;
            case '-':
            System.out.println(op1-op2);
            break;
            case '*':
            System.out.println(op1*op2);
            break;
            case '/':
            System.out.println(op1/op2);
            break;
            default:
            System.out.println("invalid operation"); 
        }
        sc.close();
    }
}
