import java.util.*;
public class QueLL {
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    Node front,rear;
    QueLL(){
        front=rear=null;
    }
    void insert(int data){
        Scanner sc=new Scanner(System.in);
        Node newNode=new Node(data);
        if(front==null&&rear==null){
            front=rear=newNode;
            System.out.println("New Queue is Initialized..");
        }
        else{
                rear.next=newNode;
                rear=newNode;
                System.out.println("Node is Enqueued");
            }
        }

    void delete(){
        Scanner sc=new Scanner(System.in);
        Node temp;
        if(front==null){
            System.out.println("Queue is Empty");
        }
        else{
                    System.out.println(front.data+" is Dequeued...");
                    front=front.next;
        }
    }

    void display(){
        Node temp=front;
        if(front==null)
            System.out.println("Queue is Empty");
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        QueLL q1=new QueLL();
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.print("Enter The Choice: ");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter The Data: ");
                    int data=sc.nextInt();
                    q1.insert(data);
                    break;
                case 2:
                    q1.delete();
                    break;
                case 3:
                    System.out.println("\nQueue: ");
                    q1.display();
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
