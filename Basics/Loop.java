package Basics;

public class Loop {
    public static void main(String[] args) {
        int number=25;
        // for(int i=1;i<=10;i++){
        //     System.out.println(number*i);
        // }
        int i=1;
        do {
            System.out.println(number*i);
            i++;
        } while (i<10);
        // table(number);
    }

    private static void table(int number) {
        int i=1;
        while(i<=10)
        {
            System.out.println(number*i);
            i++;
        }
    }

}
