import java.util.Scanner;
 class StackArray {
    private int maxsize, top;
    private int[] stackArray;

    public StackArray(int size) {
        maxsize = size;
        top = -1;
        stackArray = new int[maxsize];
    }

    void push(int data) {
        top++;
        if (top > -1 && top < maxsize) {
            stackArray[top] = data;
            System.out.println(data + " is Pushed into Stack");
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void pop() {
        if (top > -1 && top < maxsize) {
            System.out.println(stackArray[top--] + " is Pushed into Stack");
        } else {
            System.out.println("Stack UnderFlow");
        }
    }

    void peek() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else
            System.out.println("The Peek of Stack: " + stackArray[top]);
    }

    void display() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else {
            for (int i = top; i >= 0; i--)
                System.out.println(stackArray[i]);
        }
    }
}

public class Stacks {
     public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Size of Stack: ");
    int size=sc.nextInt();
    StackArray s1=new StackArray(size);
    int ch=0;
       do {
        System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Peek\n5.Exit");
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
                System.out.println("\nLinked List: ");
                s1.display();
                break;
            case 4:
                s1.peek();
                break;
            case 5:
                System.out.println("The Program is Terminated!!!");
                break;
            default:
                System.out.println("Enter Valid Option!!!");
                break;
        }
    }while(ch!=5);

}

}

