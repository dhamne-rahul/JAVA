package Basics;

public class IfElse {
    public static void main(String[] args) {
        int salary=2000;
        if(salary>15000)
        {
            salary+=2000;
        }
        else if(salary<15000&&salary>10000)
        {
            salary+=1000;
        }
        else{
            System.out.println("salary is to much less");
        }
        System.out.println(salary);
    }
}
