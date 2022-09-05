package BasicQuestion.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        int[] ans=shuffle(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] shuffle(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int i=0;
        int j=(n/2);
        int k=0;
        while(i<(n/2)&&j<n)
        {
            ans[k++]=nums[i++];
            ans[k++]=nums[j++];
        }
        return ans;
    }
}
