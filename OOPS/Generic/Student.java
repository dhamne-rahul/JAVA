package OOPS.Generic;

public class Student implements Comparable<Student> {
    public int roll;
    public int marks;

    Student(int roll,int marks)
    {
        this.roll=roll;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff=this.marks-o.marks;
        return diff;
    }
    
}
