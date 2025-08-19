import java.util.Scanner;
class QueArray {
    private int maxsize, rear,front;
    private int[] QueArray;

    public QueArray(int size) {
        maxsize = size;
        rear = -1;
        front=-1;
        QueArray = new int[maxsize];
    }

    void push(int data) {
        if (rear==-1) {
            rear++;front++;
            QueArray[rear] = data;
            System.out.println(data + " is Queued");
        } else if(rear>-1&&rear<maxsize-1) {
            rear++;
            QueArray[rear] = data;
            System.out.println(data + " is Queued");
        }else{
            System.out.println("Queue is at Maximum Capacity!!!");
        }
    }

    void pop() {
        if (front > -1 && front < maxsize) {
            System.out.println(QueArray[front] + " is Dequeued");
            front++;
        } else if(front==rear&&rear<maxsize-1){
            System.out.println(QueArray[front] + " is Dequeued\nQueue is Empty");
            front=-1;
            rear=-1;
        }else{
            System.out.println("Queue is Empty");
        }
    }

     void display() {
        if (rear==-1&&front==-1)
            System.out.println("Queue is Empty");
        else {
            for (int i = front; i<=rear&&i<maxsize; i++)
                System.out.println(QueArray[i]);
        }
    }
}

public class QueImp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Queue: ");
        int size=sc.nextInt();
        QueArray s1=new QueArray(size);
        System.out.println("A Queue with capacity "+size+" is Initialized");
        int ch=0;
        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.print("Enter The Choice: ");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter The Data: ");
                    int data=sc.nextInt();
                    s1.push(data);
                    break;
                case 2:
                    s1.pop();
                    break;
                case 3:
                    System.out.println("\nQueue: ");
                    s1.display();
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

