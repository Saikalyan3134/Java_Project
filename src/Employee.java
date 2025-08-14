import java.util.Scanner;
class Employee {
    String name,gender;
    int age,empid;
    Employee(String n,int a,String g,int e){
        this.name=n;
        this.age=a;
        this.gender=g;
        this.empid=e;
    }
}
class HR extends Employee{
    String dep;
    int salary;
    HR(String n,int a,String g,int e,int s){
        super(n,a,g,e);
        this.dep="HR";
        this.salary=s;
    }
}
