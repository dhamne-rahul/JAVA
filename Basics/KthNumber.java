package Basics;

public class KthNumber {
    public static void main(String[] args) {
        int number=742;
        int ans=0;
        while(ans<=number)
        {
            int sum=0;
            while(number>0)
            {
                sum+=(number%10);
                number/=10;
            }
            ans=sum;
            if(ans==number)
            {
                System.out.println("Yes");
                return;
            }else{
                
            }
        }
    }
}    