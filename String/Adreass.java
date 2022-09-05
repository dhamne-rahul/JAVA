package String;

import java.util.Scanner;

public class Adreass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String address=sc.next();
        System.out.println(address);
        String a=address.replace("()", "o");
        System.out.println(a);
        sc.close(); 
    }
}
