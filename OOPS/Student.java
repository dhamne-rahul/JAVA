package OOPS;

public class Student {
    public int roll_no;
    public String name;
    public float marks;
    //unparameterized constructor or default constructor.
    void greeting(){
        System.out.println("hello my name is "+ this.name);
    }
    void changeName(String name)
    {
        this.name=name;
    }
    public Student()
    {
        //calling a another constructor from constructor.
        this(12, "kunal", 56.60f);
    }
    //parameterized constructor.
    Student(int roll_no,String name,float marks)
    {
        this.roll_no=roll_no;
        this.name=name;
        this.marks=marks;
    }
    //copy constructor.
    Student(Student other)
    {
        this.roll_no=other.roll_no;
        this.name=other.name;
        this.marks=other.marks;
    }


}

