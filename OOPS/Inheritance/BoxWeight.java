package OOPS.Inheritance;

public class BoxWeight extends Box {
    public double weight;
    // @ovverride :this will be error here because we can inherit not ovverriding.
    static void greeting()
    {
        System.out.println("You are in Boxweight class");
    }
    public BoxWeight()
    {
        this.weight=-1;
    }
    public BoxWeight(BoxWeight other)
    {
        super(other);
        this.weight=other.weight;
    }
    BoxWeight(double length,double width,double height,double weight)
    {
        super(length, width, height);//this will call parent constructor.
        this.weight=weight;
    }
    public double getL()
    {
        return super.length;//it will give length variable of just above class.it is used when member name in subclass is same in name in superclass.
    }
    
}
