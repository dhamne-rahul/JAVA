package Basics.Math;

public class Ithbit {
    public static void main(String[] args) {
        int number=4;
        int iBit=4;
        int mask=1<<iBit-1;
        int ans=number&mask;
        if(ans!=0)
        {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
