import java.util.Scanner;

public class ArrOp {
    static int max(int[] a){
        int max=0;
        for(int i=0;i<a.length;i++){
            max=(a[i]>a[max])?i:max;
        }
        return max;
    }
    static int min(int[] a){
        int min=0;
        for(int i=0;i<a.length;i++){
            min=(a[i]<a[min])?i:min;
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Size of Array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("Enter Start Range:");
        int s=sc.nextInt();
        System.out.print("Enter End Range:");
        int e=sc.nextInt();
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            System.out.print("Element "+(i+1)+" : ");
            int temp=sc.nextInt();
            if(temp>s&&temp<e)
            a[i]=temp;
            else{
                System.out.println("Enter Value Within The Range!!!");
                i--;
            }
        }
        int max=max(a);
        int min=min(a);
        System.out.println("Array Elements: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nMaximum is at "+max+" : "+a[max]);
        System.out.println("Minimum is at "+min+" : "+a[min]);
        System.out.println("The Range: "+a[max]+" - "+a[min]+" = "+(a[max]-a[min]));
    }
}
