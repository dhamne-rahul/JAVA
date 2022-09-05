package OOPS.Access;

// import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        A a=new A(5, "rahul");
        // System.out.println(a.num);//it shows error because num variable is private which is not visible in Main class.
        a.setter(1000);
        System.out.println(a.getter());
    }
}
