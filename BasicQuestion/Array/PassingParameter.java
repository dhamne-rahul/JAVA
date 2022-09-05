package BasicQuestion.Array;

import java.util.Arrays;
import java.util.Scanner;

public class PassingParameter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] arr) {
        arr[0]=1000;
    }
    
}
