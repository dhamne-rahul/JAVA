package Basics.Math;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        int unique=0;
        for(int i: arr)
        {
            unique=unique^i;
        }
        System.out.println(unique);
    }
}
