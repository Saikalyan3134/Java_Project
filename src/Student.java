import java.util.Scanner;

public class Student {
    static String name,gender,sec,result;
    static int age;
    static double s1,s2,s3,sum,avg,pcent;
    static void get_details(Scanner sc){
        System.out.println("Enter The Below Details Of Student:");
        System.out.print("Name: ");
        name=sc.nextLine();
        System.out.print("Age: ");
        age=sc.nextInt();
        System.out.print("Branch: ");
        sec=sc.next();
        System.out.print("Gender: ");
        gender=sc.next();
        mark_cal(sc);

    }
    static void mark_cal(Scanner sc){
        System.out.println("Enter The Marks:");
        System.out.print("Subject1: ");
        s1=sc.nextDouble();
        System.out.print("Subject2: ");
        s2=sc.nextDouble();
        System.out.print("Subject3: ");
        s3=sc.nextDouble();
        result=(s1<35||s2<35||s3<35)?"FAIL":"PASS";
        sum=s1+s2+s3;
        avg=sum/3;
        pcent=(sum/300)*100;
    }
    static void display(){
        System.out.println("\n\nRESULTS ARE HERE!!!");
        System.out.println("Name: "+name+"\nAge: "+age+"\nBranch: "+sec+"\nGender: "+gender);
        System.out.println("SUBJECT 1: "+s1+"\nSUBJECT 2: "+s2+"\nSUBJECT 1: "+s3);
        System.out.println("TOTAL: "+sum+"/300\n"+"AVERAGE: "+avg+"\nPERCENT: "+pcent);
        System.out.println("RESULT: "+result);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        get_details(sc);
        display();
    }
}
