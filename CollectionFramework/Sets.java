package CollectionFramework;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // Set<Integer> set=new HashSet<>();
        // set.add(10);
        // set.add(20);
        // set.add(30);
        // set.add(10);
        // set.add(30);
        // set.add(140);
        // set.add(110);
        // set.remove(10);
        // System.out.println(set);
        // System.out.println(set.contains(140));
        // System.out.println(set.size());
        // set.clear();;
        // System.out.println(set);




        // Set<Integer> set=new LinkedHashSet<>();//set+linkedlist.
        // set.add(10);
        // set.add(20);
        // set.add(40);
        // set.add(10);
        // System.out.println(set);
        // set.remove(20);
        // System.out.println(set);



        Set<Integer>set=new TreeSet<>(Comparator.reverseOrder());//unique element ans in sorted order.internally implemented as bst.
        set.add(30);
        set.add(20);
        set.add(60);
        set.add(30);
        System.out.println(set);

        
        
    }
}
