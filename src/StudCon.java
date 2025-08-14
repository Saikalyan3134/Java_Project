import java.util.Scanner;
public class StudCon {
    String name,course;
    int age;
    static String city,inst;
    void input(){
        System.out.println("Enter Studend Details:");
        Scanner sc=new Scanner(System.in);
        System.out.print("Name: ");
        name=sc.nextLine();
        System.out.print("Age: ");
        age=sc.nextInt();
        System.out.print("Course: ");
        course=sc.next();
    }
    StudCon(){
        name=null;
        age=0;
        course=null;
    }
    void display(){
        System.out.println("\n\nInstitute: "+inst);
        System.out.println("City: "+city);
        System.out.println("Name:"+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Institute: ");
        inst = sc.nextLine();
        System.out.println("Enter The City: ");
        city = sc.nextLine();
        StudCon s1=new StudCon();
        s1.input();
        s1.display();

    }

}
