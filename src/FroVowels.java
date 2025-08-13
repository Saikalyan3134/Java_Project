import java.util.Scanner;
public class FroVowels {
    static String string_changer(String s) {
        String vow = "", con = "";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            char s1=Character.toLowerCase(ch);
            if (s1 =='a' ||s1 =='e' ||s1 =='i' ||s1 =='o' ||s1 =='u') {
                vow += ch;
            } else {
                con += ch;
            }
        }
        return (vow+con);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        System.out.println("Modified String: "+string_changer(s));
    }
}