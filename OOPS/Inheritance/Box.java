package OOPS.Inheritance;

public class Box //if we add fianl here it will prevent this class from get inherited.declaring class as final internally it all method declare as final.
{
    public double length;
    public double width;
    public double height;
    //using fianl keyword we prevent ovverriding
    // static final void greeting()
    // {
    //     System.out.println("You are in Box class");
    // }
    //this() is used to call constructor inside constructor.
    public Box()
    {
        this.length=-1;
        this.width=-1;
        this.height=-1;
    }
    public Box(double length,double width,double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public Box(double side)
    {
        this.length=side;
        this.width=side;
        this.height=side;
    }
    public Box(Box other)
    {
        this.length=other.length;
        this.width=other.width;
        this.height=other.height;
    }
    public double getL()
    {
        return this.length;
    }
    public void setL(double d)
    {
        this.length=d;
    }
}
