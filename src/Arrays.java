import java.lang.reflect.Array;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Arrays 1: ");
        int n1=sc.nextInt();
        System.out.print("Enter Size of Arrays 2: ");
        int n2=sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int [n2];
        System.out.println("Enter The Array Elements of A:");
        for (int i = 0; i < Array.getLength(a); i++) {
            System.out.print("Element " + i + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter The Array Elements of B:");
        for (int i = 0; i < Array.getLength(b); i++) {
            System.out.print("Element " + i + ": ");
            b[i] = sc.nextInt();
        }

        int c[]=new int[(n1>n2)?n1:n2];
        int l=c.length;
        System.out.println(l);
        System.out.println("Sum Of Corresponding Elements In Arrays:");
        for (int i = 0; i < l; i++) {
            if (i < n1 && i < n2) {
                c[i] = a[i] + b[i];
            } else if (n1<l&&i>n1-1) {
                c[i] = b[i];
            } else {
                c[i] = a[i];
            }
        }
        for (int i = 0; i < Array.getLength(c); i++) {
            System.out.println("At Index " + i + ": " + c[i] + " ");
        }
    }
}
