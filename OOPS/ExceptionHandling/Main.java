package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        // int a=10;
        // int b=0;
        try{
            String name="rahul";
            if(name.equals("rahul"))
            {
                throw new MyException("This is my exceprtion");
            }
        }catch(MyException m)
        {
            System.out.println(m.getMessage());
        }catch(ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("It will always occur");
        }
    }

    private static int  divide(int a, int b) throws ArithmeticException {
        if(b==0)
        {
            throw new ArithmeticException("do not divide by zero");
        }
        return a/b;
        
    }
    
}
