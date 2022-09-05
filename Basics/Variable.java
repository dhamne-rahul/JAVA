package Basics;

public class Variable {
    static int b=10;
    public static void main(String[] args) {
        int a=10;//class variable.
        System.out.println(a);
        System.out.println(get());
        System.out.println(b);
    }
    static int get()
    {
        b=20;
        int a=20;//local variable.
        return a;
    }
}
