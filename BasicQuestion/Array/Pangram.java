package BasicQuestion.Array;
public class Pangram {
    public static void main(String[] args) {
        String str="rahul";
        // System.out.println(str);
        isPangram(str);
    }

    public static void isPangram(String str) {
        int i=0;
        int[] arr=new int[26];
        while(i<str.length());
        {
            arr[str.charAt(i)-'a']++;
            i++;
        }
        for(int j=0;j<26;j++)
        {
            System.out.print(" "+arr[j]);
        }
    }
}
