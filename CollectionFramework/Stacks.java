package CollectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("rahul");
        stack.push("kunal");
        stack.push("tejas");
        stack.push("ketan");
        stack.pop();
        System.out.println(stack.peek());
        Iterator<String> it=stack.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        

    }
}
