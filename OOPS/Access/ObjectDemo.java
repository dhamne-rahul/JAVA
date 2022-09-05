package OOPS.Access;

public class ObjectDemo extends Object{
    int num;
    float gpa;
    ObjectDemo(int num,float gpa)
    {
        this.num=num;
        this.gpa=gpa;
    }
    @Override
    public String toString() {
        return "Num: "+this.num+" Gpa: "+this.gpa;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object get destroyed");
        super.finalize();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectDemo)obj).num;
    }
    public static void main(String[] args) {
        ObjectDemo o=new ObjectDemo(12, 1231.34f);
        System.out.println(o.toString());
    }    
}
