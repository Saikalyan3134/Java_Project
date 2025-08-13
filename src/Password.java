import java.util.Scanner;
public class Password {
    public static void main(String[] args){
        final String pass="Saipandu@987";
        Scanner sc =new Scanner(System.in);
        String in;
        for(int i=1;i<=3;i++){
            System.out.print("Enter The Password: ");
            in=sc.nextLine();
            if(in.compareTo(pass)==0){//Or we can use in.equals(pass)
                System.out.println("Password Verified");
                break;
            }
            else{
                System.out.println("Invalid Password Tries left: "+(3-i));
            }
        }

    }
}
