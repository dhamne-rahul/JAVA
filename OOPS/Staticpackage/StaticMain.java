package OOPS.Staticpackage;

import OOPS.Staticpackage.InnerClasses.Innerclass;

public class StaticMain {
    public static void main(String[] args) {
        // Human human1=new Human("rahul", 22,true);
        // Human human2=new Human("gaurav", 23, false);
        // Human human3=new Human("ajay", 24, false);
    //     // System.out.println(Human.population);
    //     StaticMain m=new StaticMain();
    // }
    // static void fun()
    // {
        // greeting()//you can not do this because it require instance but you in static method that does not need instance.
        //you can not access not static stuff without using of instance
        //hence we need to referencing to it.
    //     StaticMain  s=new StaticMain();
    //     s.greeting();
    // }
    // //the thing that are non static means that belong to object.
    // private void greeting() {
    //     System.out.println("hello YARR");


    //here we dont need to create an object of outer class for referencing.beacuse inner class is static it does not need an obh=jext reference. 
    Innerclass rahul=new Innerclass("rahul");
    System.out.println(rahul.toString());

    }


}
