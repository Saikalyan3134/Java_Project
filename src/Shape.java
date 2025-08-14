import java.util.Scanner;
//POLYMORPHISM
//Method Overriding
class Square extends Shape{
    Square(){
        super();
    }
    double area() {
        return Math.pow(super.len, 2);
    }
    void display(){
        System.out.println("The Area of Square: "+this.area());
    }
}
class Cube extends Shape{
    Cube(){
        super();
    }
    double area() {
        return Math.pow(super.len, 3);
    }
    void display(){
        System.out.println("The Area of Cube: "+this.area());
    }
}
class Shape {
    Scanner sc=new Scanner(System.in);
    int len;
    Shape(){
        System.out.println("Enter Length: ");
        this.len=sc.nextInt();
    }
    double area(){
        return 0.0;
    }
    public static void main(String[] args){
        Cube c1=new Cube();
        c1.display();
        Square s1=new Square();
        s1.display();
    }
}
