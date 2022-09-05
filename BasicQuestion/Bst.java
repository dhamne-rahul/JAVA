package BasicQuestion;

// import MultiThreading.B;

public class Bst {
    class Node{
        public int value;
        public Node left;
        public Node right;
        Node(int val)
        {
            this.value=value;
        }
    }
    public Node insert(Node root,int value)
    {
        if(root==null)
        {
            return new Node(value);
        }
        if(root.value>value)
        {
            root.left=insert(root.left, value);
        }
        else if(root.value<value)
        {
            root.right=insert(root.right,value);
        }
        return root;
    }
    public void show(Node root)
    {
        //inorder.
        if(root==null)
        {
            return;
        }
        show(root.left);
        System.out.println(root.value+",");
        show(root.right);
    }
    public static void main(String[] args) {
        Bst b=new Bst();
        Node root=null;
        b.insert(root, 5);
        b.insert(root, 1);
        b.insert(root, 3);
        b.insert(root, 4);
        b.insert(root, 2);
        b.insert(root, 7);

        b.show(root);

    }

    
}

