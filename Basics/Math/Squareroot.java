package Basics.Math;

public class Squareroot {
    public static void main(String[] args) {
        int n=40;
        double ans=root(n);
        System.out.println(ans);
    }

    private static double root(int n) {

        int st=0;
        int en=n;
        double ans=0;
        while(st<=en)
        {
            int mid=st+(en-st)/2;
            if(mid*mid==n)
            {
                return mid;
            }
            if(mid*mid<n)
            {
                st=mid+1;
            }
            else{
                en=mid-1;
                ans=mid;
            }
            double inc=0.1;
            while(ans*ans<=n)
            {
                ans+=inc;
            }
            ans-=inc;
            inc/=10;
        }
        return ans;

    }
}
