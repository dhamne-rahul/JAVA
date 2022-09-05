package OOPS.Polymorphism;

public class MethodOverloading {
    public int sum(int a,int b)
    {
        return a+b;
    }
    public double sum(int a,double b)
    {
        return a+b;
    }
    public double sum(double a,double b,double c)
    {
        return a+b+c;
    }
    /*
    method overloading rules:
    same name but diffrent retrun tye,diffrent number of paramter,diffrent order of parameter
     */
    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        System.out.println(mo.sum(10, 20));
    }

}
