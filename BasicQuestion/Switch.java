package BasicQuestion;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int emp_id=sc.nextInt();
        String dept=sc.next();
        switch(emp_id)
        {
            case 1:
            System.out.println("employee number 1");
            break;
            case 2:
            System.out.println("employee number  2");
            break;
            case 3:
            System.out.println("employee number 3");
            switch(dept)
            {
                case "Hr":
                System.out.println("Department is Human resource.");
                break;
                case "manager":
                System.out.println("department is management.");
                break;
                default:
                System.out.println("New employee.");
            }
            break;
            default:
            System.out.println("You entered wrong employee id.");
        }
    }
}
