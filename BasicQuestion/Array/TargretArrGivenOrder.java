package BasicQuestion.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargretArrGivenOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the index array");
        int[] index=new int[n];
        for(int i=0;i<n;i++)
        {
            index[i]=sc.nextInt();
        }
        int[] ans=createTargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        
        int [] ans = new int [n];
        ArrayList<Integer> target = new ArrayList<>();
        
        for(int i = 0;i < n;i++){
            target.add(index[i],nums[i]);
        }
        for(int i = 0;i < n;i++){
            ans[i] = target.get(i);
        }
        return ans;
    }
}
