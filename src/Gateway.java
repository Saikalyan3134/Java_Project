import java.util.Scanner;
abstract class Bank{
    double amnt;
    Bank(){
        System.out.print("Enter the Amount: ");
        Scanner sc =new Scanner(System.in);
        amnt=sc.nextDouble();
        sc.close();
    }
     abstract void tcal();
     abstract void display();
}
class UPI extends Bank{
    final int tax=10;
    double total,Tax;
    UPI(){
        super();
    }

    @Override
    void tcal() {
        Tax=(amnt/100)*tax;
        total=amnt+Tax;
    }

    @Override
    void display() {
        this.tcal();
        System.out.println("Payment GateWay");
        System.out.println("UPI Transaction");
        System.out.println("Amount: "+amnt+"\nTax: "+Tax+"\nPayable Amount: "+total);
    }
}
class Credit extends Bank{
    final int tax=12;
    double total,Tax;
    Credit(){
        super();
    }

    @Override
    void tcal() {
        Tax=(amnt/100)*tax;
        total=amnt+Tax;
    }

    @Override
    void display() {
        this.tcal();
        System.out.println("Payment GateWay");
        System.out.println("Card Transaction");
        System.out.println("Amount: "+amnt+"\nTax: "+Tax+"\nPayable Amount: "+total);
    }
}
class Online extends Bank{
    final int tax=5;
    double total,Tax;
    Online(){
        super();
    }

    @Override
    void tcal() {
        Tax=(amnt/100)*tax;
        total=amnt+Tax;
    }

    @Override
    void display() {
        this.tcal();
        System.out.println("Payment GateWay");
        System.out.println("Card Transaction");
        System.out.println("Amount: "+amnt+"\nTax: "+Tax+"\nPayable Amount: "+total);
    }
}
public class Gateway {
    public static void main(String[] args){
        System.out.println("Select Transaction");
        System.out.println("1.UPI\n2.Credit Card\n3.Online Banking");
        System.out.print("Option: ");
        Scanner sc=new Scanner(System.in);
        int op= sc.nextInt();
        switch (op){
            case 1:
                UPI t1=new UPI();
                t1.display();
                break;
            case 2:
                Credit t2=new Credit();
                t2.display();
                break;
            case 3:
                Online t3=new Online();
                t3.display();
                break;
            default:
                System.out.println("Enter valid Option");
                break;
        }

    }
}
