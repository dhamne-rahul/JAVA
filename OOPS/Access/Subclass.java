package OOPS.Access;

public class Subclass extends A{

    Subclass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        Subclass obj = new Subclass(45, "Kunal Kushwaha");
        int n = obj.num;
        System.out.println(n);

        System.out.println(obj instanceof Subclass);
    }
    
}
