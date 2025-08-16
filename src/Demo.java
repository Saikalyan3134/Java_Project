import java.lang.reflect.Array;
import java.util.*;
public class Demo {
    public static void main(String[] args){
        int[] a=new int[6];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Array Elements:");
        for (int i=0;i< Array.getLength(a);i++) {
            System.out.print("Element "+i+": ");
            a[i]=sc.nextInt();
        }
        System.out.println("Array  Elements at Even Indices:");
        for (int i=0;i< Array.getLength(a);i=i+2) {
            System.out.println("At Index "+i+": "+a[i]+" ");
        }
        System.out.println("Array  Elements That are Even:");
        for (int i=0;i< Array.getLength(a);i++) {
            if(a[i]%2==0)
            System.out.println("At Index "+i+": "+a[i]+" ");
        }
    }
}
