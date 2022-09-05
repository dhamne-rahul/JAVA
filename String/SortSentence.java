package String;

import java.util.ArrayList;
import java.util.Scanner;

public class SortSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<StringBuilder> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=0 && s.charAt(i)<=9)
            {
                list.set(s.charAt(i),sb);
                sb.deleteCharAt(0);
            }
            sb.append(s.charAt(i));
        }
        System.out.println(list);
    }
}
