package OOPS.Abstract;

public class Daughter extends Parent{

    Daughter(int age) {
        super(age);
        //TODO Auto-generated constructor stub
    }

    @Override
    void carrier() {
        System.out.println("I am Daughter and i am Pharmcist");
    }
    @Override
    void partner() {
        System.out.println("my partner is rashmi");
    }
    
    
}
