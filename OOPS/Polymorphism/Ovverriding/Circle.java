package OOPS.Polymorphism.Ovverriding;

public class Circle extends Shape {
    /*
     this will run when object of Circle is created and hence it override the show() function in base class.
     */
    @Override //this is an annoation we is just like 
    void show()
    {
        System.out.println("we are inside child class ->Circle");
    }
}
