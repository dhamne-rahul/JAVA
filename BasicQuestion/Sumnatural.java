package BasicQuestion;

public class Sumnatural {
    public static void main(String[] args) {
        int n=10;
        System.out.println(sumnumber(n));
    }
    static public int sumnumber(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
}
