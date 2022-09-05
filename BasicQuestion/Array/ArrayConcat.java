package BasicQuestion.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        int[] ans=concate(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] concate(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++)
        {
            ans[i]=nums[i%(nums.length)];
        }
        return ans;
    }
}
