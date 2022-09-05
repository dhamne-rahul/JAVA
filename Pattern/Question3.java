package Pattern;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        for(int i=rows;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1+""+" ");
            }
            System.out.println();
        }
    }
}
