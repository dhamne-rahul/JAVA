package OOPS.Staticpackage;

public class InnerClasses {
    static class Innerclass{

        String name;
        Innerclass(String name)
        {
            this.name=name;
        }
        @Override
        public String toString() {
            return name ;
        }
    }
}
