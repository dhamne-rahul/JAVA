package OOPS.Generic;

public class ComparisonObject{
    public static void main(String[] args) {
        Student s1=new Student(11, 98);
        Student s2=new Student(22, 98);

        if(s1.compareTo(s2)==0)
        {
            System.out.println("both student are equal");
        }
        else{
            System.out.println("Student are not equal");
        }

    }
    
}
