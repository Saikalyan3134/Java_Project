import java.util.Scanner;
import java.util.Scanner;
//Abstraction
//Method area in Shape1 class is abstract method
class Square1 extends Shape1{
    Square1(){
        super();
    }
    double area() {
        return Math.pow(super.len, 2);
    }
    void display(){
        System.out.println("The Area of Square: "+this.area());
    }
}
class Cube1 extends Shape1{
    Cube1(){
        super();
    }
    double area() {
        return Math.pow(super.len, 3);
    }
    void display(){
        System.out.println("The Area of Cube: "+this.area());
    }
}
abstract  class Shape1 {
    Scanner sc=new Scanner(System.in);
    int len;
    Shape1(){
        System.out.println("Enter Length: ");
        this.len=sc.nextInt();
    }
    abstract double area();

}

public class Abstraction {
    public static void main(String[] args){
        Cube1 c1=new Cube1();
        c1.display();
        Square1 s1=new Square1();
        s1.display();
    }
}
