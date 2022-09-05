package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Box.greeting();
        // Box box1=new Box();
        // System.out.println(box1);
        // System.out.println(box1.getL());
        // box1.setL(12.564);
        // System.out.println(box1.getL());
        // BoxWeight bw1=new BoxWeight(1, 2, 3, 4);
        // System.out.println(bw1.length);
        // System.out.println(bw1.weight);//we can use the base class variable also.that is the power of inheritance that it gives code reuse.


        // Box box=new BoxWeight(1,2,3,4);
        // System.out.println(box.height);//parent class can reference to subclass.
        // System.out.println(box.weight);//cant access because superclass reference can refer to object .
        //but it does not refer to object then reference variable will determine which member get access.so here we can not 
        //access the weight variable.
        BoxWeight bw=new BoxWeight();// subclass can not refer to superclass
        Box b=new Box(11, 22, 33);
        System.out.println(bw.getL());

    }
}
