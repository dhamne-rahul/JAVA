package BasicQuestion.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPremutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        int[] ans=getans(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] getans(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
