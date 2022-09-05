package OOPS.Interfaces;

public class Car implements Engine,MediaPlayer,Brake{
    int a=10;
    @Override
    public void brake() {
        System.out.println("car will brake");
    }
    @Override
    public void start() {
        System.out.println("Engine will start");
    }
    @Override
    public void stop() {
        System.out.println("Engine will stop");
    }
}
