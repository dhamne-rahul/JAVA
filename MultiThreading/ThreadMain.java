package MultiThreading;

public class ThreadMain {
    public static void main(String[] args) {
        // using extending thread class:-

        // MultiThreadingDemo tm=new MultiThreadingDemo();
        // tm.start();
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(" main thread");
        //     try{

        //         Thread.sleep(1000);
        //     }catch(Exception e)
        //     {
        //         System.out.println(e.getMessage());
        //     }
        // }
        //using runnable interface:-

        MultiThreadingRunnable mr=new MultiThreadingRunnable();
        Thread t=new Thread(mr);
        t.start();
        for(int i=0;i<5;i++)
        {
            System.out.println(" main thread");
            try{

                Thread.sleep(1000);
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

/*

OP:-
//main thread can be executed by jvm which is first thred 
after that other thread are get executed simultaneously.  



 main thread
Thread output
Thread output
 main thread
Thread output
 main thread
Thread output
 main thread
Thread output
 main thread 
 */
