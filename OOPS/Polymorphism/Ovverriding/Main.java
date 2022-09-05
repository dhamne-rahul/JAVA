package OOPS.Polymorphism.Ovverriding;

public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.show();
        Shape s=new Circle();
        s.show();//it also show that we are in circle class i.e it override the parent class show method.
        Shape s2=new Shape();
        /*object type will define what will be run and referance type shows what will be access.  */
        s2.show();
    }
}
