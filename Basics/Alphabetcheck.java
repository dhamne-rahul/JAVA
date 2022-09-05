package Basics;

import java.util.Scanner;

public class Alphabetcheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        if(ch >'a'&& ch <='z')
        {
            System.out.println("character is lower_case");
        }
        else{
            System.out.println("character is Upper_case");
        }
        sc.close();
    }
}
