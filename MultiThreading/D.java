package MultiThreading;

public class D {
    public static void main(String[] args) {
        C c=new C();
        Thread t=new Thread(c);
        t.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread");
            try{
                t.sleep(1000);
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
