package Basics.Math;

public class Euclidian {
    public static void main(String[] args) {
        int ans=euclid(4,3);
        System.out.println(ans);
    }

    private static int euclid(int a, int b) {
        if(b==0)
        {
            return a;
        }
        return euclid(b,a%b);
    }
}
