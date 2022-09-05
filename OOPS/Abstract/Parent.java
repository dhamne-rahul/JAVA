package OOPS.Abstract;

public abstract class Parent {
    int age;
    final int VALUE;

    Parent(int age)
    {
        this.age=age;
        VALUE=1234;
    }
    static void greeting()
    {
        System.out.println("Hello");
    }
    public void normal()
    {
        System.out.println("This is normal method");
    }
    abstract void carrier();
    abstract void partner();
}
