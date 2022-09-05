package BasicQuestion;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number=153;
        int retainNumber=number;
        int sum=0;
        while(number>0)
        {
            int rem=number%10;
            sum+=Math.pow(rem, 3);
            number/=10;
        }
        System.out.println(sum);
        System.out.println(number);
        if(retainNumber==sum)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }
}
