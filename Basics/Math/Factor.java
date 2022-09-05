package Basics.Math;

public class Factor {
    public static void main(String[] args) {
        int n=20;
        factor(n);
    }

    private static void factor(int n) {
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                if(n/i==i)
                {
                    System.out.print(i+" ");
                }
                else{
                    System.out.println(i+" "+(n/i)+" ");
                }
            }

        }
    }
}
