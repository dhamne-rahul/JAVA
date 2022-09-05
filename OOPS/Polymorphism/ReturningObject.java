package OOPS.Polymorphism;

public class ReturningObject {
    int a;
    public ReturningObject(int i)
    {
        this.a=i;
    }
    public ReturningObject increByTen()
    {
        ReturningObject ro=new ReturningObject(a+10);
        return ro;
    }
    public static void main(String[] args) {
        ReturningObject ro=new ReturningObject(10);
        ReturningObject ro2=ro.increByTen();
        System.out.println(ro2.a);
    }
}
