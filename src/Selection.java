import java.util.Scanner;

public class Selection {
     static void selsort(int[] a){
         for(int i=a.length-1;i>0;i--){
             int max=0;
             for(int j=1;j<i;j++){
                 max=(a[j]>a[max])?j:max;
             }
             int temp = a[i];
             a[i] = a[max];
             a[max] = temp;

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
        selsort(a);
        System.out.println("\nSorted Array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
