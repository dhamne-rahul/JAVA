package MultiThreading;

public class MultiThreadingRunnable implements Runnable {

    @Override
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Runnable interface method");
            try{
                Thread.sleep(1000);
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }   
    
}
