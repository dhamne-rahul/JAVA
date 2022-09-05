package MultiThreading;

public class C implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<5;i++)
        {
            System.out.println("inside thread THREAD");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }
        }
    }
    
}
