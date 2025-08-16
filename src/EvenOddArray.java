import java.util.Scanner;
public class EvenOddArray {
    static void EvOd(int[] a){
        int[] shifted=new int[a.length];
        int odd=0,ev=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
                odd++;

        }
        ev=odd;
        odd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                shifted[ev++]=a[i];
            }
            else{
                shifted[odd++]=a[i];
            }

        }
        System.out.println("\nODD EVEN SEPERATOR");
        for(int i=0;i<shifted.length;i++){
            System.out.print(shifted[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Arrays: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter The Array Elements:");
        for (int i = 0; i <a.length; i++) {
            System.out.print("Element " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: ");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        Bubble.bubble(a);
        System.out.println("\nSorted Array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        EvOd(a);

    }
}
