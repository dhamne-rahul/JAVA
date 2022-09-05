package BasicQuestion;

import java.util.Scanner;

public class StringPallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int i=str.length()-1;
        String ans="";
        while(i>=0)
        {
            ans+=str.charAt(i);
            i--;
        }
        System.out.println(ans);
    }
}
