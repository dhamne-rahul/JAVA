package Basics;

public class First {
    public static void main(String...args) {
        String s="rahul";
        ans(s);
    }

    private static void ans(String s) {
        int i=0;
        int[] arr=new int[26];
        while(i<s.length())
        {
            arr[s.charAt(i)-'a']++;
            i++;
        }
        for(int j=0;j<26;j++)
        {
            System.out.print(" "+arr[j]);
        }
    }
}
