package OOPS.Staticpackage;

public class StaticBlock {
    static int a=10;
    static int b;
    //static block get executed when class get loaded first time.
    static{
        System.out.println("static block is executed");
        b=a*4;
    }
    public static void main(String[] args) {
        StaticBlock sb=new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);
        System.out.println(StaticBlock.b);
        sb.b+=2;
        StaticBlock sb1=new StaticBlock();
        System.out.println(StaticBlock.b);


    }

}
