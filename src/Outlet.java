import java.util.Scanner;
class Retail{
    String name;
    int qty;
    float price;
    Retail(String n,int q,float p){
        this.name=n;
        this.qty=q;
        this.price=p;
    }
    void display(){
        System.out.println("Retail Items Available:");
        System.out.println("Name: "+name+"\nQuantity: "+qty+"\nPrice: "+price);
    }
}
class Purchase extends Retail{
    String pname;int pqty;float pprice;
    float total;
    Purchase(String n,int q,float p,String pname,int pqty){
        super(n,q,p);
        this.pname=pname;
        this.pqty=pqty;
        this.pprice=price;
    }
    void calculate(){
        if(pqty>qty){
            System.out.println("Not Enough STOCK");
        }
        else{
            total=pqty*pprice;
        }
    }
    void display(){
        super.display();
        System.out.println("Purchased  Item:");
        System.out.println("Name: "+name+"\nQuantity: "+qty+"\nPrice: "+price+"Total: "+total);
    }

}
public class Outlet {
    static String n,pn;
    static int q,pq;
    static float p,pp;
    static void get_details( Scanner sc){
        System.out.print("Enter Item Name: ");
        n=sc.next();
        System.out.print("Enter Item Quantity: ");
        q=sc.nextInt();
        System.out.print("Enter Item Price: ");
        p=sc.nextFloat();
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Retail Items For Stock:");
        get_details(sc);
        System.out.println("Enter The Item Details For Purchase:");
        System.out.print("Enter Item Name: ");
        pn=sc.next();
        System.out.print("Enter Item Quantity: ");
        pq=sc.nextInt();
        System.out.print("Enter Item Price: ");
        pp=sc.nextFloat();
        Purchase pc=new Purchase(n,q,p,pn,pq);
        pc.calculate();
        pc.display();

    }
}
