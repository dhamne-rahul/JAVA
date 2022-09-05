package OOPS.Polymorphism.Ovverriding;

public class Shape {
    //you can't remove show() from here because reference variable may used to access. 
    void show()
    {
        System.out.println("We are in Parent class -> Shape");
    }
}
