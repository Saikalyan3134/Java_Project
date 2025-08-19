import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class LinkedList {
    Node head;
    void insert(int data){
        Scanner sc=new Scanner(System.in);
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            System.out.println("New List is Initialized..");
        }
        else{
            System.out.println("\n1.Start\n2.Middle\n3.End");
            System.out.print("Inset At : ");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    newNode.next=head;
                    head=newNode;
                    System.out.println("Node Is Inserted at Start...");
                    break;

                case 2:
                    System.out.print("Enter the Position: ");
                    int pos=sc.nextInt();
                    Node temp1=head;
                    for(int i=1;i<pos && temp1.next!=null;i++)
                        temp1=temp1.next;
                    newNode.next=temp1.next;
                    temp1.next=newNode;
                    System.out.println("Node Is Inserted at Position...");
                    break;
                case 3:
                    Node temp=head;
                    while(temp.next!=null)
                        temp=temp.next;
                    temp.next=newNode;
                    System.out.println("Node Is Inserted at End...");
                    break;
                default:
                    System.out.println("Insertion Aborted!!!");
        }
    }
}
void delete(){
    Scanner sc=new Scanner(System.in);
    Node temp;
    if(head==null){
        System.out.println("Nothing Delete");
    }
    else{
        System.out.println("\n1.Start\n2.Middle\n3.End");
        System.out.print("Delete At : ");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println(head.data+" is Deleted at Start...");
                head=head.next;
                break;

            case 2:
                System.out.print("Enter the Position: ");
                int pos=sc.nextInt();
                temp=head;
                Node prev=temp;
                for(int i=1;i<=pos && temp.next!=null;i++) {
                    prev=temp;
                    temp = temp.next;
                }
                if(prev!=null){
                prev.next=temp.next;
                temp.next=null;
                System.out.println(temp.data+" is Deleted in the middle");
                }
                else{
                    System.out.println("Invalid Position!!!");
                }
                break;
            case 3:
                temp=head;
                while(temp.next.next!=null) {
                    temp = temp.next;
                }
                System.out.println(temp.next.data+" is Deleted at End...");
                temp.next=null;
                break;
            default:
                System.out.println("Deletion Aborted!!!");
        }
    }
}

    void display(){
        Node temp=head;
        if(head==null)
            System.out.println("Linked List is Empty");
        else{
            while(temp!=null){
                System.out.print(temp.data+" -->");
                temp=temp.next;
            }
            System.out.println(" NULL");
        }
    }
    public static void main(String[] args){
       LinkedList l1=new LinkedList();
       Scanner sc=new Scanner(System.in);
       int ch=0;
       do {
           System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit");
           System.out.print("Enter The Choice: ");
           ch = sc.nextInt();
           switch (ch){
               case 1:
                   System.out.print("Enter The Data: ");
                   int data=sc.nextInt();
                   l1.insert(data);
                   break;
               case 2:
                  l1.delete();
                  break;
               case 3:
                   System.out.println("\nLinked List: ");
                   l1.display();
                   break;
               case 4:
                   System.out.println("The Program is Terminated!!!");
                   break;
               default:
                   System.out.println("Enter Valid Option!!!");
                   break;
           }
       }while(ch!=4);

    }
}
