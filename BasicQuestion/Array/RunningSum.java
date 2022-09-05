package BasicQuestion.Array;
import java.util.Arrays;
import java.util.Scanner;
public class RunningSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        int[] ans=runningsum(nums);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] runningsum(int[] nums) {
        int[] ans=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
