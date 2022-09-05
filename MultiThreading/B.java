package MultiThreading;

public class B {
    public static void main(String[] args) throws InterruptedException {
        A a=new A();
        a.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("rohit");
            Thread.sleep(1000);
        }
    }

}
