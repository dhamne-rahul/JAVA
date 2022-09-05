package BasicQuestion.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Repeatede {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]!=(arr[i]-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
