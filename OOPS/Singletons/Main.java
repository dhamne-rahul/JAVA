package OOPS.Singletons;

public class Main {
    public static void main(String[] args) {
        // Singleton s=new Singleton();//can not visible because is is private constuctor it prevent the object creation.
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        //here no two object created both s1 and s2 are pointing to same object.

    }
}
