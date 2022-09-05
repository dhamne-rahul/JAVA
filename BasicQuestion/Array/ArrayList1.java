package BasicQuestion.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // ArrayList<Integer> list=new ArrayList<>();
        //  list.add(10);
        //  list.add(20);
        //  list.add(30);
        //  list.add(40);
        //  list.add(50);
        //  list.remove(1);
        // System.out.println(list);
        ArrayList<ArrayList<Integer>>list =new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());//initialization of list. 
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                list.get(i).add(sc.nextInt());//add element.
            }
        }
        System.out.println(list);
    }
}
