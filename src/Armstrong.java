import java.util.Scanner;
public class Armstrong {
    static int cube(int a){
        return a*a*a;
    }
    static String arm_check(int n){
        int arm=0;
        for (int i=n;i>0;i=i/10){
            int rem=i%10;
            arm +=cube(rem);
        }
        return ((arm==n)?"YES":"NO");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number(To check it is Armstrong or not): ");
        int num=sc.nextInt();
        System.out.println("Is "+num+" a Armstrong: "+arm_check(num));
    }
}
