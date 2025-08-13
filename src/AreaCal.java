import java.util.Scanner;
public class AreaCal {
    static double area(double base,double height){
        return (0.5*base*height);
    }
    static double area(int len,int wid){
        return (len*wid);
    }
    static double area(double side){
        return (side*side);
    }
    static double area(float r){
        return (Math.PI*Math.pow(r,2));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Triangle\n2.Square\n3.Rectangle\n4Circle");
        System.out.println("Choose the Shape you want area for: ");
        int op=sc.nextInt();
        switch (op){
            case 1:
                System.out.print("Base:");
                double base=sc.nextDouble();
                System.out.print("Height:");
                double height=sc.nextDouble();
                System.out.print("Area of Triangle: "+area(base,height));
                break;
            case 2:
                System.out.println("Side:");
                double side=sc.nextDouble();
                System.out.print("Area of Square: "+area(side));
                break;
            case 3:
                System.out.print("Length:");
                int len=sc.nextInt();
                System.out.print("Width:");
                int wid=sc.nextInt();
                System.out.print("Area of Rectangle: "+area(len,wid));
                break;
            case 4:
                System.out.print("Radius:");
                float r=sc.nextFloat();
                System.out.print("Area of Circle: "+area(r));
                break;
            default:
                System.out.print("ERROR:Invalid Input");
                break;
        }
    }
}
