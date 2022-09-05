package MultiThreading.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char key=sc.next().trim().charAt(0);
        boolean ans=searchInString(str,key);
        System.out.println(ans);
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    private static boolean searchInString(String str, char key) {
        int i=0;
        while(i<str.length())
        {
            if(str.charAt(i)==key)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}
