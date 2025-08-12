import java.util.*;
public class Demo {
    static void cal(int a ,int b) {
        int op;
        System.out.println("1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for Maximum\n6 for Minimum\n Choose an operator:");
        Scanner sc = new Scanner(System.in);
        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Result is: " + (a + b));
                break;
            case 2:
                System.out.println("Result is: " + (a - b));
                break;
            case 3:
                System.out.println("Result is: " + (a * b));
                break;
            case 4:
                System.out.println("Result is: " + (a / b));
                break;
            case 5:
                System.out.println("Result is:" + Math.max(a, b));
                break;
            case 6:
                System.out.println("Result is:" + Math.min(a, b));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
       int ch=0;
       while (ch!=-1)
       {
           cal(a,b);
           System.out.print("Enter -1 to Terminate or other key to continue:");
           ch=sc.nextInt();
       }
    }
}
