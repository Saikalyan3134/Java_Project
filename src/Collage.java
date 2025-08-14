import java.util.Scanner;
class Person {
    Scanner sc =new Scanner(System.in);
    String name, gender;
    int age;

    Person(String n, int a, String g) {
        this.name = n;
        this.age = a;
        this.gender = g;
    }
    void display(){//This method is overridden in class Coolie and Faculty
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender"+gender);
    }
}
class Coolie extends Person{
        String course;
        int stdid,sub1,sub2,sub3,total;
        double pcent;

Coolie(String n, int a, String g) {
    super(n,a,g);
    System.out.print("Enter Student ID: ");
    this.stdid=sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Course: ");
    course=sc.nextLine();
    this.percents();
}
void percents(){
    System.out.println("Enter Marks of "+super.name);
    System.out.print("Subject 1: ");
    this.sub1=sc.nextInt();
    System.out.print("Subject 2: ");
    this.sub2=sc.nextInt();
    System.out.print("Subject 3: ");
    this.sub3=sc.nextInt();
    total=sub1+sub2+sub3;
    pcent=total/3;
}
void display(){
    System.out.println("AITS Student:");
    System.out.println("Student Id: "+stdid);
    System.out.println("Course: "+course);
    super.display();
    System.out.println("Marks: "+total);
    System.out.println("Percentage: "+pcent+" %");
}
}
class Faculty extends Person{
    String dep;
    int empid,sal;
    Faculty(String n, int a, String g){
        super(n,a,g);
        this.get_details();
    }
    void get_details(){
        System.out.print("Department of :");
        this.dep=sc.nextLine();
        System.out.print("Your Employee ID: ");
        this.empid=sc.nextInt();
        System.out.print("Salaray: ");
        this.sal=sc.nextInt();

    }
    void display(){
        System.out.println("AITS FACULTY:");
        System.out.println("Employee ID: "+empid);
        super.display();
        System.out.println("Department of "+dep);
        System.out.println("Salary: ₹"+sal);
    }
}
public class Collage {
    public static void main(String[] args){
        String sname,fname,sgender,fgender;
        int sage,fage;
        System.out.println("AITS PORTAL");
        System.out.println("1.Student\n2.Faculty");
        System.out.print("Whos Logging in: ");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        sc.nextLine();
        switch (ch){
            case 1:
                System.out.print("Enter Name: ");
                sname=sc.nextLine();
                System.out.println("Enter Age: ");
                sage=sc.nextInt();
                System.out.println("Enter Gender:");
                sgender=sc.next();
                Coolie s1=new Coolie(sname,sage,sgender);
                s1.display();
                break;
            case 2:
                System.out.print("Enter Name: ");
                fname=sc.nextLine();
                System.out.println("Enter Age: ");
                fage=sc.nextInt();
                System.out.println("Enter Gender:");
                fgender=sc.next();
                Faculty f1=new Faculty(fname,fage,fgender);
                f1.display();
                break;
            default:
                System.out.println("Select Valid Option");
                break;
        }

    }
}

