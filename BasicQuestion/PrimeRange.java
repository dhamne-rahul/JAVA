package BasicQuestion;

public class PrimeRange {
    public static void main(String[] args) {
        int start=1;
        int end=50;
        printPrime(start,end);
    }

    private static void printPrime(int start, int end) {
        for(int i=start;i<=end;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isprime(int i) {
        if(i==0&&i==1)
        {
            return true;
        }
        for(int j=2;j<=Math.sqrt(i);j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;
    }
}
