import java.util.Scanner;
public class Palindrome {
    static String rev(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String: ");
        String s= sc.nextLine();
        String rev=rev(s);
        System.out.println("Reversed: "+rev);
        String palin=(s.equalsIgnoreCase(rev))?"Yes":"No";
        System.out.println("Is "+s+" a Palindrome: "+palin);
    }
}
