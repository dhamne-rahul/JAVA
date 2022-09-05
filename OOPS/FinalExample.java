package OOPS;

public class FinalExample {
    //final variable we cant reassign.it is act as constant.
    final int NUM=10;
    String name;
    public FinalExample(String name)
    {
        this.name=name;
    }
    public static void main(String[] args) {
        final FinalExample f=new FinalExample("rahul");
        // f.NUM=23;//we can not reassign to final it.
        // f=new FinalExample("gaurav");//final referance can not reassign.
        System.out.println(f);
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object get destroyed");
        // TODO Auto-generated method stub
        super.finalize();
    }
    
}
