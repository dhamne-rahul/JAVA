//partially run.
package String;

import java.util.Scanner;

public class RegularExpression{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String pattern=sc.nextLine();
        boolean ans=regularExpression(s,pattern);
        System.out.println(ans);
    }

    private static boolean regularExpression(String s, String pattern) {
        if(pattern.length()!=s.length())
        {
            return false;
        }
        boolean ans=true;
        int i=0;
        while(i<s.length())
        {
            if(pattern.charAt(i)=='.')
            {
                i++;
                break;
            }
            if(pattern.charAt(i)=='*')
            {
                ans=true;
            }
            else if(s.charAt(i)!=pattern.charAt(i))
            {
                ans=false;
            }
            
            i++;
        }
        return ans;
    }
}