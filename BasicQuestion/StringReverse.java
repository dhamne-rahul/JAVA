package BasicQuestion;

public class StringReverse {
    public static void main(String[] args) {
        String str="rahul";
        String ans="";
        int i=0;
        while(i<str.length())
        {
            char ch=str.charAt(i);
            ans=ch+ans;
            i++;
        }
        System.out.println(ans);
    }
}
