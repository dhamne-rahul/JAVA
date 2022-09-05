package OOPS.Staticpackage;

public class Human {
    String name;
    int age;
    boolean isMarried;
    static long population;
    static void greeting()
    {
        //this will give error beacuse object is not created in static method.its a class variable.
        // System.out.println("Hello "+ this.name);
        System.out.println("Hello");
    }
    Human(String name,int age,boolean isMarried)
    {
        this.name=name;
        this.age=age;
        this.isMarried=isMarried;
        Human.population+=1;//is get called by class name.because it is class variable.it is created only once when class get loaded.

    }  
}
