package String;

import java.util.Scanner;

public class AlikeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s.toLowerCase();
        System.out.println(s);
        int i=0;
        int n=s.length()/2;
        int j=n;
        int count1=0;
        int count2=0;
        while(i<n && j<s.length())
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
            {
                count1++;
            }
            if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')
            {
                count2++;
            }
            j++;
            i++;
        }
        if(count1==count2)
        {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
