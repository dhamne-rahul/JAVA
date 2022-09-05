package OOPS.Access;

public class A {
    protected int num;
    String name;
    int[] arr;

    A(int num,String name)
    {
        this.num=num;
        this.name=name;
        arr=new int[num];
    }
    public int getter()
    {
        return this.num;
    }
    public void setter(int num)
    {
        this.num=num;
    }

}
