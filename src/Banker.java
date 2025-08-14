import java.util.Scanner;
public class Banker{
    String name,gender;
    int age;
    double balance;
    static String branch,bank;
    Banker(String n,int a,String g,double b){
        name=n;
        age=a;
        gender=g;
        balance=b;
    }
    void display(){
        System.out.println("\n\nBank Name: "+bank);
        System.out.println("Branch: "+branch);
        System.out.println("Name:"+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Balance: ₹"+balance);

    }
    void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Transaction Withdrawl:");
        System.out.print("Enter Amount:");
        double atm=sc.nextDouble();
        if(atm>0){
            balance-=atm;
            System.out.println("Transaction Successful");
        }
        else{
            System.out.println("Enter Valid amount!!!");
        }
        System.out.println("Current Balance: ₹"+balance);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Bank Details:");
        System.out.println("Bank: ");
        bank = sc.nextLine();
        System.out.println("Branch: ");
        branch = sc.nextLine();
        System.out.println("\nEnter Student Details:");
        System.out.print("Name: ");
        String n=sc.nextLine();
        System.out.print("Age: ");
        int a=sc.nextInt();
        System.out.print("Gender: ");
        String g =sc.next();
        System.out.println("Balance: ");
        double b=sc.nextDouble();
        Banker c1=new Banker(n,a,g,b);
        c1.display();
        c1.withdraw();

    }

}
