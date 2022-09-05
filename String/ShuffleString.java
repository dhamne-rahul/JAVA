package String;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class ShuffleString {
    public static void main(String[] args) {
        int[] indices={4,5,6,7,0,1,2,3};
        String s="codeLeet";
        String ans="";
        String mid="";
        int i=0;
        while(indices[i]!=0)
        {
            mid+=s.charAt(i);
            i++;
        }
        for(;i<indices.length;i++)
        {
            ans+=s.charAt(i);
        }
        ans+=mid;
        System.out.println(ans);
    }
}
