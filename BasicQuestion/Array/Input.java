package BasicQuestion.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int[] arr=new int[5];
        // for(int i=0;i<arr.length;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        String[] arr=new String[3];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        arr[0]="sagar";
        System.out.println(Arrays.toString(arr));
        sc.close();;
    }
}
