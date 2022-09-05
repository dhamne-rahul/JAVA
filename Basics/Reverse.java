package Basics;

public class Reverse {
    public static void main(String[] args) {
        int number=123456;
        System.out.println(revrse(number));
    }

    private static int revrse(int number) {
        int ans=0;
        while(number>0)
        {
            int rem=number%10;
            ans=rem+ans*10;
            number/=10;
        }
        return ans;
    }   
}
