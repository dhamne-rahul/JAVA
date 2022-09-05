package Basics;

public class Occurance {
    public static void main(String[] args) {
        int first=14447454;
        int second=4;
        int count=0;
        while(first>0)
        {
            int rem=first%10;
            if(rem==second)
            {
                count++;
            }
            first/=10;
        }
        System.out.println(count);
    }
}
