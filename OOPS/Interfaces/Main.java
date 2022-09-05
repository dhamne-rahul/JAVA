package OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car=new Car();
        // car.brake();
        // car.start();
        // car.stop();
        // System.out.println(Engine.a);
        // NiceCar n=new NiceCar();
        // n.startMedia();
        // Innerinterface ii=new Innerinterface();
        // ii.greet();
        Nested n=new Nested();
        System.out.println(n.isodd(11));
    }
}
