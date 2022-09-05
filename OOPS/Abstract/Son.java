package OOPS.Abstract;

public class Son extends Parent {

    Son(int age) {
        super(age);
    }
    @Override
    public void normal()
    {
        super.normal();
    }
    @Override
    void carrier() {
        System.out.println("I am Son and i am coder ");
    }

    @Override
    void partner() {
        System.out.println("My partner is narendra modi");
        
    }
    
}
