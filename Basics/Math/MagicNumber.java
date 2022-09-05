package Basics.Math;

public class MagicNumber {
    //Amazon
    public static void main(String[] args) {
        int ans=0;
        int n=3;
        int base=5;
        while(n>0)
        {
            int last=n&1;
            ans+=last*base;
            base*=5;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
