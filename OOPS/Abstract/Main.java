package OOPS.Abstract;

public class Main {
    public static void main(String[] args) {
        Daughter daughter =new Daughter(22);
        daughter.carrier();
        Parent daughter1 =new Daughter(23);
        daughter1.carrier();//dyanamic polymorphism.
        Son son=new Son(24);
        son.carrier();
        Parent.greeting();
        daughter1.normal();
        son.normal();
    }
}
