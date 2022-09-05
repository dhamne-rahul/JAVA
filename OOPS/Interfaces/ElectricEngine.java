package OOPS.Interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine start");
        
    }

    @Override
    public void stop() {
        System.out.println("electric engine stop");   
    }
    
}
