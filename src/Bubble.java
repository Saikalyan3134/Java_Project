import java.util.Scanner;
public class Bubble {
    static void bubble(int[] a) {
        for (int i = 0; i < a.length-1; i++)
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
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
        bubble(a);
        System.out.println("\nSorted Array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
