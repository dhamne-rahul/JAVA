package OOPS.Interfaces;

public class Nested  implements C.NestedInterface{

    @Override
    public boolean isodd(int n) {
        return (n&1)==1;
    }
}
