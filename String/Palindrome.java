package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=new String(sc.nextLine());
        boolean ans=isPalindrome(s);
        System.out.println(ans);

    }

    private static boolean isPalindrome(String s) {
        for(int i=0;i<s.length()/2;i++)
        {
            int st=s.charAt(i);
            int en=s.charAt(s.length()-1-i);
            if(st!=en)
            {
                return false;
            }
        }
        return true;
    }
}
